package Locaters;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTagLocator {

	public static void main(String[] args) {
		
		//Launching the browser
		WebDriver driver = new ChromeDriver();	
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get("https://demowebshop.tricentis.com/");
		
		// identify all the links
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    for (WebElement ele:links)
	
	    
	   
		{
		 System.out.println(ele .getText());
		}
	    
	    //close the browser
	    driver.quit();
	

	}

}
