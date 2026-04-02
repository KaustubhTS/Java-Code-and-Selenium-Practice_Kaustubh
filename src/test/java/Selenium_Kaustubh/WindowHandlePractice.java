package Selenium_Kaustubh;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlePractice {
	// WebDriver declared as a field; initialization happens in @BeforeClass
	private static WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Setup WebDriver binary
		WebDriverManager.chromedriver().setup();

		// Optional: Configure ChromeOptions (e.g., headless mode)
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless"); // Uncomment for headless execution

		// Initialize ChromeDriver
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://testautomationpractice.blogspot.com/");

	}

	@Test
	public void WindowHandling() {

		WebElement OpenNewWindowsButton = driver.findElement(By.xpath("//button[@id='PopUp']"));
		String ParentWindow = driver.getWindowHandle();

		OpenNewWindowsButton.click();

		Set<String> ChildWindows = driver.getWindowHandles();

		for (String Window : ChildWindows) {
			if (!Window.equals(ParentWindow)) {
				driver.switchTo().window(Window);
				System.out.println("Window Url is " + driver.getCurrentUrl());
				System.out.println("Window title is " + driver.getTitle());

			}
		}

		driver.switchTo().window(ParentWindow);
		System.out.println("Parent title " + driver.getTitle());

	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
