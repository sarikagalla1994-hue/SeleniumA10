package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingNewWindowAndTab {

	public static void main(String[] args) throws InterruptedException {
  
		//Launch the browser
				WebDriver driver =new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//implicit wait 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				Thread.sleep(3000);	
				
				//Navigate to an application
				driver.get("https://www.swiggy.com/restaurents");
					
				//create a new window
				driver.switchTo().newWindow(WindowType.WINDOW);
				Thread.sleep(3000);	

				//create a new tab
				driver.switchTo().newWindow(WindowType.TAB);
				Thread.sleep(3000);	

				//close the browser
				driver.quit();
	}

}
