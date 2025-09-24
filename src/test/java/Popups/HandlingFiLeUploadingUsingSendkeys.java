package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFiLeUploadingUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
				WebDriver driver =new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//implicit wait 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
				
				//navigate to an appl
				driver.get("https://the-internet.herokuapp.com/upload");
				Thread.sleep(3000);
				
				//
				driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\selenium 1.txt");
				
				//close the browser
				driver.quit();
				
	}

}
