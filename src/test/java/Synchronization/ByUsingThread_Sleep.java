package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingThread_Sleep {

	public static void main(String[] args) throws InterruptedException {

				//Launch the browser
						WebDriver driver =new ChromeDriver();
						
						//Maximize the window
						driver.manage().window().maximize();
						
						//navigate to an application
						driver.get("https://shoppersstack.com/");
						Thread.sleep(30000);
						
						//identify the login btn and click
						driver.findElement(By.id("loginBtn")).click();
						Thread.sleep(10000);
						
						//close the browser
						driver.quit();
						

	}

}
