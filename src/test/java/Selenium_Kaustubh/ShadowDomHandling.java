package Selenium_Kaustubh;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilities_For_Selenium_Kaustubh.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDomHandling {
	
	// WebDriver declared as a field; initialization happens in @BeforeClass
			private WebDriver driver;

			@BeforeClass
			public void setUp() {
				// Setup WebDriver binary
				WebDriverManager.chromedriver().setup();

				// Optional: Configure ChromeOptions (e.g., headless mode)
				ChromeOptions chromeOptions = new ChromeOptions();
				 //chromeOptions.addArguments("--headless"); // Uncomment for headless execution
				chromeOptions.addArguments("--start-maximized");

				// Initialize ChromeDriver
				driver = new ChromeDriver(chromeOptions);
				driver.get("https://practice.expandtesting.com/shadowdom");
				
			}
			
			@AfterClass
		    public void tearDown() {
		        if (driver != null) {
		            driver.quit();
		        }
		    }
		
		@Test	
		public void ShadowDOM() throws InterruptedException
		{
			JavaScriptUtil jsUtil =new JavaScriptUtil(driver);
			Thread.sleep(5000);
			SearchContext root1 = driver
		            .findElement(By.cssSelector("#shadow-host"))
		            .getShadowRoot();

		    WebElement element=root1.findElement(By.cssSelector("#my-btn"));
		    jsUtil.jsClick(element);
				
		}

}
