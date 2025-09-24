package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingMouseOverAndScroll {

	public static void main(String[] args) throws InterruptedException {

		//Launching the browser
				WebDriver driver = new ChromeDriver();
				
				//Maximize the window
			    driver.manage().window().maximize();
			    
			  //implicit wait time
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
			      //navigate to the URL
		  		driver.get("https://www.amazon.in/");
		  		
		  		//Identify the prime button and mouseover 
		        WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		        
		        Actions act = new Actions(driver);
		        act.moveToElement(prime).perform();
		        Thread.sleep(3000);
		        
		        WebElement join = driver.findElement(By.linkText("Join Prime Now"));
		        act.click(join).perform();
		        
		        act.scrollByAmount(0, 700).perform();
		        Thread.sleep(3000);
		        
		        WebElement music = driver.findElement(By.xpath("//h3[text()='Prime Music']"));
		        act.scrollToElement(music).perform();
		        
		        
		        Thread.sleep(3000);
		        
		        //close the browser
		        driver.quit();
		        
		  		
		  		

		
	}

}
