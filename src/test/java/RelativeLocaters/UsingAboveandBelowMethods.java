package RelativeLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingAboveandBelowMethods {

	public static void main(String[] args) throws InterruptedException {
		//Launching the browser
	    WebDriver driver = new ChromeDriver();
	
	    //Maximize the window
        driver.manage().window().maximize();
	
        //navigate to the URL
  		driver.get("https://www.facebook.com/");
  		
  		//Identify password Textfield
  		WebElement pswd = driver.findElement(By.id("pass"));
  		
  		//Identify Username textfield
  		WebElement un = driver.findElement(RelativeLocator.with(By.tagName("input")).above(pswd));
  		
  		driver.findElement(RelativeLocator.with(By.tagName("button")).below(pswd));
  		
  		un.sendKeys("selenium");
  		pswd.sendKeys("abc123");
  		Thread.sleep(4000);
  		
  		//close the browser
  		driver.quit(); 
	}

}
