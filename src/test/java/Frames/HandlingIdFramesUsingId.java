package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIdFramesUsingId {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
				WebDriver driver =new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//implicit wait 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
				
				//navigate to an appl
				driver.get("https://www.zomato.com/Restaurents/reviews");
				Thread.sleep(3000);
				
				//Identify login link
				driver.findElement(By.linkText("Log in")).click();
				Thread.sleep(3000);

				//switch the driver control to the frame
				driver.switchTo().frame("auth-login-ui");
				Thread.sleep(2000);

				//identify phone no text field
				driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("7670810604");
				Thread.sleep(2000);

				//identify quit icon
				driver.findElement(By.xpath("//h2[text()='Login']/following-sibling::i")).click();
				Thread.sleep(3000);

				//switch the driver control to the main webpage
				driver.switchTo().defaultContent();
				Thread.sleep(3000);

				//print reviews text
				WebElement reviews = driver.findElement(By.xpath("//h1"));
				
				System.out.println(reviews.getText());
				
				//close the browser
				driver.quit();
				
				
	}

}
