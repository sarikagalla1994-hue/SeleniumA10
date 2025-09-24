package Locaters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {

		//Launching the browser
				WebDriver driver = new ChromeDriver();	
				
				//maximize the window
				driver.manage().window().maximize();
				
				//Navigate to the URL
				driver.get("https://www.facebook.com/");
				
				//identify forgotten password linktext
				driver.findElement(By.linkText("Forgotten password?")).click();
				
				Thread.sleep(3000);
				
				driver.quit();
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
