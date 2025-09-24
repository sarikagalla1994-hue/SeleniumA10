package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ByUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//implicit wait ti 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		////navigate to an appl
		driver.get("https://shoppersstack.com/");
		
		
		////identify the login btn and click
		WebElement login=driver.findElement(By.id("loginBtn"));
		
		//explicit wait
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(login));
		
		login.click();
		
		//explicit wait
		wait.until(ExpectedConditions.titleContains("ShoppersStack | Login"));
		System.out.println("got the title");
		
		driver.findElement(By.id("Email")).sendKeys("selenium@124");
		driver.findElement(By.id("Password")).sendKeys("abc@123");
		WebElement btn=driver.findElement(By.id("Login"));
		
		//explicit wait using ele to be clickable
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
		
		Thread.sleep(9000);
		
		
		//close the browser
		driver.quit();
		
		
	}

}
