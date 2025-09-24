package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingKeyboardActions {

	public static void main(String[] args) throws InterruptedException {

		//Launching the browser
				WebDriver driver = new ChromeDriver();
				
				//Maximize the window
			    driver.manage().window().maximize();
			    
			  //implicit wait time
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			      //navigate to the URL
		  		driver.get("https://www.facebook.com/");
		  		
		  		//
		  		  WebElement untf = driver.findElement(By.id("email"));
		  		  
		          Actions act = new Actions(driver);
                  act.moveToElement(untf).click(untf).sendKeys("selenium").perform();
                  
                  Thread.sleep(3000);
                  
                  act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
                  
                  Thread.sleep(3000);
                  
                  // close the browser
                  driver.quit();
		  		  
                 
		  		
	}

}
