package Selenium_Kaustubh;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest01 {

	// WebDriver declared as a field; initialization happens in @BeforeClass
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Setup WebDriver binary
		WebDriverManager.chromedriver().setup();

		// Optional: Configure ChromeOptions (e.g., headless mode)
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--headless"); // Uncomment for headless execution

		// Initialize ChromeDriver
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
	
	@AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

	@Test
	public void checkTitle() {
		// Simple navigation to verify driver works

		System.out.println("Page title: " + driver.getTitle());

	}

	@Test
	public void scrollusingJSExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");// scroll by 500 pxl

		WebElement ele = driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

		ele.click();

		// js.executeScript("window.scrollTo(0, document.body.scrollHeight);");//Scroll
		// to bottom
	}

	@Test
	public void takeScreenshot() throws IOException  {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(screenshot, new File("C:/SeleniumScreenshots/screenShot1.png"));

	}

    

}