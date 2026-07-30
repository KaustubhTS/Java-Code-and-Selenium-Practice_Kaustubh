package Selenium_Kaustubh;

import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class selectClass {
	
	@Ignore
	public void selectClassPractice()
	{
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement element= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select select = new Select(element);
		List<WebElement> allOptions=driver.findElements(By.xpath("//select[@id='dropdown-class-example']/option"));
		
		for(WebElement e :allOptions )
		{
			if(e.getText().equals("Option1"))
			{
				select.selectByVisibleText("Option1");
				break;
			}
			else {
				System.out.println("Error");
			}
		}
		
	}
	
	
}
