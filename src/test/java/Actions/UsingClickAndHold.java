package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingClickAndHold {

	public static void main(String[] args) throws InterruptedException {
      
		//Launching the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
	    driver.manage().window().maximize();
	    
	  //implicit wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	      //navigate to the URL
  		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
  		
  		WebElement circle = driver.findElement(By.id("circle"));
  		
        Actions act = new Actions(driver);
        act.clickAndHold(circle).perform();
        
        Thread.sleep(3000);
        
        act.release(circle).perform();
        Thread.sleep(3000);
        
        //close the browser
        driver.quit();
  		
  		
	}

}
