package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching the browser
		WebDriver driver = new ChromeDriver();	
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(20000);
		
		//Identify username TextField and pass the text
	     driver.findElement(By.name("name")).sendKeys("selenium");
	     
	     //Identify username TextField and pass the text
	     driver.findElement(By.name("email")).sendKeys("sel@gmail.com");
	     
	     //identify the logib button and click on it
	     driver.findElement(By.name("password")).sendKeys("sel123");
	     
	     Thread.sleep(3000);
	     
	     //close the browser
	     driver.quit();
	     

	}

}
