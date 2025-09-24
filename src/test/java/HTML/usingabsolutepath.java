package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingabsolutepath {
	
	public static void main(String[]args) throws InterruptedException {
		

		//Launching the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
	    driver.manage().window().maximize();
		
	      //navigate to the URL
	  		driver.get("file:///C:/Users/HP/OneDrive/Desktop/SampleLoginWebpage1.html");  
	  		Thread.sleep(3000);
	  		
		   //identify username textfield
	  		WebElement un=driver.findElement(By.xpath("./html/body/input[1]"));
	  		un.sendKeys("selenium");
	  		
	  		Thread.sleep(3000);
	  		
	  		//identify password textfield
	  		WebElement pswd=	driver.findElement(By.xpath("./html/body/input[2]"));
	  		pswd.sendKeys("abc123");
	  		Thread.sleep(3000);
	  		
	  		//identify the forgotten password link
	  		driver.findElement(By.xpath("./html/body/a")).click();
	  		Thread.sleep(3000);
	  		
	  		//close the browser
	  		driver.quit();
	  		
   }
		
	}


