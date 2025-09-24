package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptPopup {

	public static void main(String[] args) throws InterruptedException {
     
		        //Launch the browser
				WebDriver driver =new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//implicit wait 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
				
				//navigate to an appl
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				Thread.sleep(2000);
				
				//Identify java script alert button and click it.
			 	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
				Thread.sleep(3000);
				
				//swith the driver control to alert popup
			    Alert al = driver.switchTo().alert();
			    al.sendKeys("selenium");
			    al.accept();
				Thread.sleep(3000);

				
				//Identify the result and print the text
			    WebElement res =	driver.findElement(By.id("result"));
				System.out.println(res.getText());
				
				//close the browser
				driver.quit();
				

				
				
	}

}
