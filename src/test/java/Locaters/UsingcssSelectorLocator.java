package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingcssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();	
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		//
		driver.findElement(By.cssSelector("input[name=\"q")).sendKeys("mobile");
		
		//
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
