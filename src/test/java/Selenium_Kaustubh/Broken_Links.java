
package Selenium_Kaustubh;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Links {
	
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
		 // Navigate to the target URL
       // driver.get("http://www.deadlinkcity.com/");
		driver.get("http://www.amazon.com/");
	}
	
	@AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	
	
	@Test 
	public void BrokenLinks()
	{
		
		 int brokenlinks = 0;

	        try {
	            // Set implicit wait timeout
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            
	           

	            // Take Screenshot logic
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            File screenshot = ts.getScreenshotAs(OutputType.FILE);
	            try {
	                // Saving the screenshot to a file
	                FileUtils.copyFile(screenshot, new File("screenshot.png"));
	            } catch (IOException e) {
	                System.out.println("Failed to save screenshot: " + e.getMessage());
	            }

	            // Find all links on the page
	            List<WebElement> links = driver.findElements(By.tagName("a"));
	            System.out.println("Total links found: " + links.size());

	            // Iterate through each link
	            for (WebElement link : links) {
	                String linkurl = link.getAttribute("href");

	                // Skip invalid/non-http links
	                if (linkurl == null || linkurl.isBlank()
	                        || linkurl.startsWith("javascript:")
	                        || linkurl.startsWith("mailto:")
	                        || linkurl.startsWith("#")) {
	                    continue;
	                }

	                HttpURLConnection conn = null;
	                try {
	                    URL url = new URL(linkurl);
	                    conn = (HttpURLConnection) url.openConnection();
	                    conn.setConnectTimeout(5000);
	                    conn.setReadTimeout(5000);

	                    // Establish connection
	                    conn.connect();

	                    int responseCode = conn.getResponseCode();
	                    
	                    // Check if the response code indicates a broken link (4xx or 5xx)
	                    if (responseCode >= 400) {
	                        System.out.println(linkurl + " ===> Broken Link (" + responseCode + ")");
	                        brokenlinks++;
	                    } else {
	                        //System.out.println(linkurl + " ===> Not Broken Link (" + responseCode + ")");
	                    }
	                } catch (Exception e) {
	                    System.out.println(linkurl + " ====> Broken Link (Exception: " + e.getMessage() + ")");
	                    brokenlinks++;
	                } finally {
	                    // Ensure connection is closed
	                    if (conn != null) {
	                        conn.disconnect();
	                    }
	                }
	            } // End of for loop

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Print final count
	            System.out.println("Total number of broken links: " + brokenlinks);
	           
		
	}

	}
	
	@Test
	public void brokenLinksUsingStream()
	{
		

	        

	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println("Total links found: " + links.size());

	        links.stream()
	                .map(link -> link.getAttribute("href"))
	                .filter(href -> href != null && !href.isEmpty())
	                .forEach(href -> {

	                    try {
	                        URL url = new URL(href);
	                        HttpURLConnection connection =
	                                (HttpURLConnection) url.openConnection();

	                        connection.setRequestMethod("HEAD");
	                        connection.connect();

	                        int responseCode = connection.getResponseCode();

	                        if (responseCode >= 400) {
	                            System.out.println("Broken Link: " + href +
	                                    " Response Code: " + responseCode);
	                            
	                        }
	                        
	                        

	                    } catch (Exception e) {
	                        System.out.println("Error checking link: " + href);
	                    }
	                });
	}
	
}
