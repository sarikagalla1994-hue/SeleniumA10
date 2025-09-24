package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingrelativepath {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching the browser
				WebDriver driver = new ChromeDriver();
				
				//Maximize the window
			    driver.manage().window().maximize();
				
			      //navigate to the URL
			  		driver.get("file:///C:/Users/HP/OneDrive/Desktop/SampleLoginWebpage1.html");  
			  	
			  		
				   //identify username textfield
			  		driver.findElement(By.xpath("//input[1]")).sendKeys("selenium");
			  		
			  	//identify password textfield
			  		driver.findElement(By.xpath("//input[2]")).sendKeys("abc123");
			  		Thread.sleep(3000);
			  		
			  		//identify forgotten password link and click
			  		driver.findElement(By.xpath("//a")).click();
			  		Thread.sleep(3000);
		
			  		//close the browser
			  		driver.quit();
			  		
			  		
			  		
			  		

	}

}
