package Utilities_For_Selenium_Kaustubh;



import org.openqa.selenium.*;
import java.util.List;

public class FrameHandlerUtility {

    protected WebDriver driver;

    // Add a public no-arg constructor so test classes can be instantiated by TestNG.
    public FrameHandlerUtility() {
        // no-op
    }

    public FrameHandlerUtility(WebDriver driver) {
        this.driver = driver;
    }

    public boolean switchToFrameContainingElement(By locator) {

        driver.switchTo().defaultContent();

        if (isElementPresent(locator))
            return true;

        List<WebElement> frames = driver.findElements(By.cssSelector("iframe, frame"));

        boolean found = searchInFrames(locator, frames);

        if (!found) {
            driver.switchTo().defaultContent();
        }

        return found;
    }

    private boolean searchInFrames(By locator, List<WebElement> frames) {
        for (WebElement frame : frames) {
            try {
                driver.switchTo().frame(frame);

                if (isElementPresent(locator)) {
                    // now driver is focused inside the frame that contains the locator
                    return true;
                }

                List<WebElement> childFrames = driver.findElements(By.cssSelector("iframe, frame"));

                if (childFrames.size() > 0) {
                    boolean found = searchInFrames(locator, childFrames);
                    if (found) {
                        return true; // keep driver inside the child frame where element was found
                    }
                }

                // element not found in this frame subtree -> go back up
                driver.switchTo().parentFrame();
            } catch (NoSuchFrameException | StaleElementReferenceException | InvalidSelectorException e) {
                // ignore and continue searching other frames
                try {
                    driver.switchTo().defaultContent();
                } catch (Exception ignore) {
                }
            }
        }
        return false;
    }

    private boolean isElementPresent(By locator) {
        try {
            return driver.findElements(locator).size() > 0;
        } catch (StaleElementReferenceException | InvalidSelectorException e) {
            return false;
        }
    }
}