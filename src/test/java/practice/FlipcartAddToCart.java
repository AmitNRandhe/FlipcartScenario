package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipcartAddToCart {
	
	@Test
	public void flipcartAddToCart() throws InterruptedException
	{
		  WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		   
		    driver.get("https://www.flipkart.com/");
		    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();   
		    driver.findElement(By.name("q")).sendKeys("winter heater");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		   
		    driver.findElement(By.xpath("(//a[text()='WunderVoX 3D Flame Styling Wall Mounted Heater Winter W...'])[1]")).click();
		  
		    Set<String> window = driver.getWindowHandles();
		    for(String st:window) {            
		    	   
		    	   System.out.println(st);
		           driver.switchTo().window(st);
		           
		    }
		      
		      driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		           
		    

	}
		

}
