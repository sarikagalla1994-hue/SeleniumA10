package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingxpathbyGroupIndexing {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
	    driver.manage().window().maximize();
		
	      //navigate to the URL
	  		driver.get("https://www.facebook.com/");  
	  		
	  		//Identify username textfield using groupindexing
	  		driver.findElement(By.xpath("(//input)[3]")).sendKeys("selenium");
	  		
	  		//identify passwd 
	  		driver.findElement(By.xpath("(//input)[4]")).sendKeys("abc123");
	  		
	  		//Identify login btn and click on it
	  		driver.findElement(By.xpath("//button")).click();
	  		
	  		Thread.sleep(3000);
	  		
	  		driver.quit();
	}

}
