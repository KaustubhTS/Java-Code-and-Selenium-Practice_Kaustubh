package Selenium_Kaustubh;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleing {

	// WebDriver declared as a field; initialization happens in @BeforeClass
	private static WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Setup WebDriver binary
		WebDriverManager.chromedriver().setup();

		// Optional: Configure ChromeOptions (e.g., headless mode)
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless"); // Uncomment for headless execution

		// Initialize ChromeDriver
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://seleniumpractise.blogspot.com/2017/");

	}

	@Test
	public void WindowHandling() {
		try {
			
			driver.manage().window().maximize();
			String parentId = driver.getWindowHandle();// parent //Seperate
			
			driver.findElement(By.xpath("//a[text()=' Click here for Google ']")).click(); // 1
			driver.findElement(By.xpath("//a[text()=' Click here for Facebook ']")).click();// 2
			driver.findElement(By.xpath("//a[text()=' Click here for Gmail ']")).click();// 3
			
			//3 Windows
			
			Set<String> ids = driver.getWindowHandles();//All child windows here
			
			
			List<String> windows = new ArrayList<>(ids);// parent and childs //Sorting 

			if (switchToRightWindow("Facebook", windows)) {
				System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
			} else {
				System.out.println("Target window not found");
			}

			 switchToParentWindow(parentId);
			closeAllWindowsExceptParent(parentId, windows);
			// switchToRightWindow("google",windows);

		} finally {
			driver.quit();
		}
	}

	public static void switchToParentWindow(String parentWindowId) {
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
	}

	public static void closeAllWindowsExceptParent(String parentWindowId, List<String> windows) {
		for (String handle : windows) {
			if (!handle.equals(parentWindowId)) {
				driver.switchTo().window(handle).close();
			}
		}
		driver.switchTo().window(parentWindowId);
	}

	public static boolean switchToRightWindow(String windowTitle, List<String> windows) { // gmail,facebook,google
		for (String window : windows) {
			String title = driver.switchTo().window(window).getTitle();// google
			if (title.contains(windowTitle)) {
				System.out.println("Found the right window");
				return true;
			}
		}
		return false;
	}
	
	@AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
