package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByAttribute {

	public static void main(String[] args) throws InterruptedException {

		//Launching the browser
				WebDriver driver = new ChromeDriver();
				
				//Maximize the window
			    driver.manage().window().maximize();
				
			      //navigate to the URL
			  		driver.get("https://www.facebook.com/");  
			  		Thread.sleep(3000);
			  		
			  	// Identify UN textfield and PSWD the text
			  		driver.findElement(By.xpath("//input[@data-testid=\"royal-email\"]")).sendKeys("selenium");
			  		
			  	// Identify UN textfield and PSWD the text
			  		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("abc123");
			  		
			  		//
			  		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			  		
			  		//close the browser
			  		driver.quit();
			  		
			  	
			  		
			  	
			  		
			  		
			  		
			  		
			  		
	}

}
