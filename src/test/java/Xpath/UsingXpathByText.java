package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByText {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
	    driver.manage().window().maximize();
		
	      //navigate to the URL
	  		driver.get("https://www.facebook.com/");  
	  		
	  		// Identify hearder and print the text 
	  		WebElement header = driver.findElement(By.xpath("//h2"));
	  		System.out.println(header.getText());
	  		
	  		//Identify username textfield xpath by attribute and pass the text
	  		WebElement un = driver.findElement(By.xpath("//input[@data-testid=\"royal-email\"]"));
	  		un.sendKeys("selenium");
	  		
	  		//Identify password textfield xpath by arribute and pass the text
	  		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
	  		
	  		//identify login button using xpth by text and click on it
	  		driver.findElement(By.xpath("//button[.='Log in']")).click();
	  		Thread.sleep(3000);
	  		
	  		// close the browser
	  		driver.quit();
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	}

}
