package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAbsoluteAndReletiveXpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		
WebDriver driver = new ChromeDriver();
		
		//Maximize the window
	    driver.manage().window().maximize();
		
	      //navigate to the URL
	  		driver.get("file:///C:/Users/HP/OneDrive/Desktop/SampleLoginWebpage1.html");  
	  		Thread.sleep(3000);
	  		
	  	//identify username textfield
	  		driver.findElement(By.xpath("./html/body/input[1]")).sendKeys("selenium");
	  		
	  	//identify password textfield
	  		driver.findElement(By.xpath("")).sendKeys("abc123");
	  		Thread.sleep(3000);
	  		
	  		//identify forgotten password link and click
	  		driver.findElement(By.xpath("//a")).click();
	  		Thread.sleep(3000);

	  		//close the browser
	  		driver.quit();
	  		
	  		
		   
	  		

	}

}
