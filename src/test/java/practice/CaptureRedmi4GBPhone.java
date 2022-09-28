package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureRedmi4GBPhone {

	@Test
	public void captureRedmi4GBPhone()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();   
	    driver.findElement(By.name("q")).sendKeys("redmi");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	 List<WebElement> mobiles = driver.findElements(By.xpath("//li[@class='rgWa7D' and (text()='4 GB RAM | 64 GB ROM | Expandable Upto 1 TB')]"));
	
	   for(WebElement element: mobiles)
	   {
		   System.out.println(element.getText());
	   }
	}
	
}
