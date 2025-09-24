package Synchronization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingImplicitWait {

	public static void main(String[] args) {
		//Launch the browser
				WebDriver driver =new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//implicit wait 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
						
				
				//navigate to an appl
				driver.get("https://shoppersstack.com/");
				
				
				////identify the login btn and click
				driver.findElement(By.id("loginBtn")).click();
				
				//close the browser
				driver.quit();
				
	}

}
