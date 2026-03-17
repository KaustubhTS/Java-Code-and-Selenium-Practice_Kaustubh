package Selenium_Kaustubh;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilities_For_Selenium_Kaustubh.ElementUtils;
import Utilities_For_Selenium_Kaustubh.FrameHandlerUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandling extends FrameHandlerUtility {

	@BeforeClass
	public void setUp() {
		// Setup WebDriver binary
		WebDriverManager.chromedriver().setup();

		// Optional: Configure ChromeOptions (e.g., headless mode)
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless"); // Uncomment for headless execution
		chromeOptions.addArguments("--start-maximized");

		// Initialize ChromeDriver and assign to inherited protected driver
		driver = new ChromeDriver(chromeOptions);
		
		

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		if (driver != null) {
			
			driver.quit();
		}
	}

	@Test
	public void Frames() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		

		
		By elementToClickInsideFrame = By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[2]/a");
		ElementUtils elementUtils = new ElementUtils(driver);
		elementUtils.click(elementToClickInsideFrame);

		
		
	}
	
	@Test
	public void FrameTest1() {
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		
		By locator=By.xpath("//span[contains(text(),'Hi, I am the UI.Vision IDE')]");
		ElementUtils elementUtils = new ElementUtils(driver);
		elementUtils.click(locator);
	}
	
@Test	
public void FrameTest2() {
		
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		
		
		By locator=By.xpath("//a[@class='ws-btn ws-green ws-hover-green ga-featured ga-htmlfree w3-margin-top']");
		ElementUtils elementUtils = new ElementUtils(driver);
		elementUtils.click(locator);
	}

@Test
public void FrameTest3() {
	
	driver.get("https://seleniumbase.io/w3schools/iframes");
	
	
	By locator=By.xpath("//a[normalize-space()='seleniumbase.io/w3schools/iframes']");
	ElementUtils elementUtils = new ElementUtils(driver);
	elementUtils.click(locator);
}



}