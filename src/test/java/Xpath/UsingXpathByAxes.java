package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;              

public class UsingXpathByAxes {

	public static void main(String[] args) {

	    	//Launching the browser
		    WebDriver driver = new ChromeDriver();
		
		    //Maximize the window
	        driver.manage().window().maximize();
		
	        //navigate to the URL
	  		driver.get("https:www.flipkart.com/");
	  		
	  		//Identify search textfield and pass the text
	        driver.findElement(By.name("q")).sendKeys("mobile"  + Keys.ENTER);
	  		
	  		//Identify dynamic element using ancestor and escendent axes
	  		WebElement price = driver.findElement(By.xpath("//div[text()='REDMI A3X (Olive Green, 128 GB)']/ancestor::div[@class=\"yKfJKb row\"]/descendant::div[@class=\"Nx9bqj _4b5DiR\"]"));
	  		
	  		System.out.print(price.getText());
	  		
	  		//Using parent and child axes
//	  	    //div[text()='REDMI A3X (Olive Green, 128 GB)']/parent::div/parent::div
//	  		/child::div[@class="col col-5-12 BfVC2z"]/child::div
//	  		/child::div/child::div[@class="Nx9bqj _4b5DiR"]
	  		
	  		
	     	//html/head/link/following-sibling::meta
	  		//following-sibling::script/preceding-sibling::link/preceding-sibling::meta
	  		
	  		//close the browser
	  		driver.quit();

		
	}

}
