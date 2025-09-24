package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPOM {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement name = driver.findElement(By.id("name"));
		Thread.sleep(3000);
		name.sendKeys("selenium");
		
	  //  LoginPomPage 1 =  new Loginpomepage(driver);
		// 1.getNameTF().sendkeys("selenium");
	    	Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);
	//	1.getNameTF().sendKeys("selenium");

	
	}
	
	

}