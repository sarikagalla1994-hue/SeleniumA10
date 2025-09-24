package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesUsingIndex {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		
		//navigate to an appl
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		//Identify the un text feild and passs the text 
		driver.findElement(By.id("username")).sendKeys("Sarika");
		Thread.sleep(2000);
		
		//Identify the password text feild and pass the text 
		driver.findElement(By.id("password")).sendKeys("abc@123");
		Thread.sleep(2000);
		
		//Click on the login button 
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
		

	}


		
	}


