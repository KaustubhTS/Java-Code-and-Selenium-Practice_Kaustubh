package Selenium_Kaustubh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingPractice01 {
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
	
	
	public void HandleWindows

}
