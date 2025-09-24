package RelativeLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingToRightOfTAndToLeftOfMethods {

	public static void main(String[] args) throws InterruptedException {

		
		//Launching the browser
	    WebDriver driver = new ChromeDriver();
	
	    //Maximize the window
        driver.manage().window().maximize();
	
        //navigate to the URL
  		driver.get("https:www.flipkart.com/");
  		
  		//Identify cart link
  		WebElement cart = driver.findElement(By.linkText("Cart"));
  		
  		//Using cart identify "login" button and click on it
  		driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(cart)).click();
  		
  		Thread.sleep(3000);
  		//Navigate back to homepage
  		driver.navigate().back();
  		Thread.sleep(3000);
  		
  		//Handle login popup
  		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
  		Thread.sleep(3000);
  		
  		// Identify cart link
  		WebElement cart_01 = driver.findElement(By.linkText("cart"));
  		
  		//Using cart Identify "Become a selller" and click on it
  		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(cart_01)).click();
  		
  		Thread.sleep(3000);
  		
  		//c;ose the browser
  		driver.quit();
  		
  		
  		
  				
  		
	}

}
