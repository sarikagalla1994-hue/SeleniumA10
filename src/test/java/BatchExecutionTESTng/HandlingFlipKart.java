package BatchExecutionTESTng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class HandlingFlipKart {
	@Parameters("browser")
	@Test(groups = "ft")

	public void flipkart(String BROWSER) throws InterruptedException {
		
		WebDriver driver = null;
		//Launch the browser
		if(BROWSER.equals("chrome")) {
		    driver =new ChromeDriver();
		}else if(BROWSER.equals("edge")) {
			driver =new EdgeDriver();
		}else if(BROWSER.equals("firefox")) {
			driver =new FirefoxDriver();
		}
			
				//Maximize the window
				driver.manage().window().maximize();
				
				//implicit wait 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
				
				//navigate to an appl
				driver.get("https://www.flipkart.com/");
				Thread.sleep(2000);

				//close the browser
				driver.quit();

	}

}
