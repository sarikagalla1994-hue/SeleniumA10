package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingclassnameLocator {

	public static void main(String[] args) throws InterruptedException {

		//Launching the browser
				WebDriver driver = new ChromeDriver();	
				
				//maximize the window
				driver.manage().window().maximize();
				
				//Navigate to the URL
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(10000);
				
				//Identify USERNAME textfield and pass the text
				driver.findElement(By.className("_55r1")).sendKeys("selenium");
			
				//Identify PASSWORD textfield and pass the text
				driver.findElement(By.className("_9npi")).sendKeys("abc123");
				
				//Identify LOGIN button and click on it
				driver.findElement(By.className("_4jy6")).click();
				Thread.sleep(3000);
				
				//close the brpwser
				driver.quit();
		
				
				
			
	}

}
