package searchContextMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElements {

	public static void main(String[] args) {
		
		//Launching the browser
		WebDriver driver = new ChromeDriver();	
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get("https://www.facebook.com/");
		
		// identify all the links
	    List<WebElement> links =	driver.findElements(By.xpath("//a"));
	
	for (WebElement ele:links)
	{
	 System.out.println(ele .getText());
	}
		
  driver.quit();
	}

}


