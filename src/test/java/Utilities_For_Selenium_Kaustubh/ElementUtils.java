package Utilities_For_Selenium_Kaustubh;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ElementUtils {

    WebDriver driver;
    FrameHandlerUtility frameHandler;
    // default wait timeout in seconds
    private final Duration defaultTimeout = Duration.ofSeconds(10);

    public ElementUtils(WebDriver driver) {
        this.driver = driver;
        frameHandler = new FrameHandlerUtility(driver);
    }

    public void click(By locator) {

        // attempt to find element in current window first
        boolean switched = frameHandler.switchToFrameContainingElement(locator);

        WebDriverWait wait = new WebDriverWait(driver, defaultTimeout);

        if (!switched) {
            // try other open windows/tabs
            String originalWindow = driver.getWindowHandle();
            boolean foundInOtherWindow = tryFindInOtherWindows(locator);

            if (!foundInOtherWindow) {
                // element not found inside any frame - try waiting in the current window's default content before failing
                driver.switchTo().window(originalWindow);
                driver.switchTo().defaultContent();
                WebElement el = wait.until(ExpectedConditions.elementToBeClickable(locator));
                el.click();
                driver.switchTo().defaultContent();
                return;
            }
        }

        // at this point driver has been switched to the window/frame that contains the element
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(locator));
        el.click();

        driver.switchTo().defaultContent();
    }

    public void type(By locator,String text) {

        boolean switched = frameHandler.switchToFrameContainingElement(locator);

        WebDriverWait wait = new WebDriverWait(driver, defaultTimeout);

        if (!switched) {
            String originalWindow = driver.getWindowHandle();
            boolean foundInOtherWindow = tryFindInOtherWindows(locator);

            if (!foundInOtherWindow) {
                driver.switchTo().window(originalWindow);
                driver.switchTo().defaultContent();
                WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                el.clear();
                el.sendKeys(text);
                driver.switchTo().defaultContent();
                return;
            }
        }

        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        el.clear();
        el.sendKeys(text);

        driver.switchTo().defaultContent();
    }

    private boolean tryFindInOtherWindows(By locator) {
        Set<String> handles = driver.getWindowHandles();
        String current = driver.getWindowHandle();

        for (String handle : handles) {
            try {
                driver.switchTo().window(handle);
                driver.switchTo().defaultContent();

                // try to find element in this window (search frames)
                FrameHandlerUtility fh = new FrameHandlerUtility(driver);
                boolean switched = fh.switchToFrameContainingElement(locator);
                if (switched || driver.findElements(locator).size() > 0) {
                    // leave driver focused on the window/frame where element is found
                    return true;
                }
            } catch (NoSuchWindowException e) {
                // window disappeared - continue
            } catch (Exception e) {
                // ignore other transient errors and continue searching
            }
        }

        try {
            driver.switchTo().window(current);
            driver.switchTo().defaultContent();
        } catch (Exception ignore) {
        }

        return false;
    }
}