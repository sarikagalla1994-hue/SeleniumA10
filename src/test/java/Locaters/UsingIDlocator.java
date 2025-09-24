package Locaters;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDlocator {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching the browser
				WebDriver driver = new ChromeDriver();	
				
				//maximize the window
				driver.manage().window().maximize();
				
				//Navigate to the URL
				driver.get("https://www.facebook.com/");
				
				//Identify username TextField and pass the text
			     driver.findElement(By.id("email")).sendKeys("selenium");
			     
			     //Identify username TextField and pass the text
			     driver.findElement(By.id("pass")).sendKeys("abc123");
			     
			     //identify the login button and click on it
			     driver.findElement(By.name("login")).click();
			     
			     Thread.sleep(3000);
			     
			     //close the browser
			     driver.quit();
			     
			     
			   
			     
			     
			     
			     
			     
			     
			     
			     
				

	}

}
