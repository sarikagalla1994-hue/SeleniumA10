package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingxpathByContains {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Launching the browser
				WebDriver driver = new ChromeDriver();
				
				//Maximize the window
			    driver.manage().window().maximize();
				
			      //navigate to the URL
			  		driver.get("https://www.facebook.com/");  
			  		
			  		//Identify forgotten password link and click on it
			  		//Using xpath by contains----> using 
                    driver.findElement(By.xpath("//a[contains(text(),'For')]")).click();
               
		  		//Identify tf and pass the pho
		  		//Using xpath by contains----> using 
               driver.findElement(By.xpath("//input[contains(@placeholder,'Email a')]")).sendKeys("1234567890");
               
               //Identify search button and click on it
               driver.findElement(By.xpath("//button[contains(@id,'di')]")).click();
               
               Thread.sleep(3000);
               
               //close the browser
               driver.quit();
               
               


             
			  		

	}

}
