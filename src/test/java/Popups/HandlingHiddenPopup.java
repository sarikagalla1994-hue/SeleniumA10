package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenPopup {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
				WebDriver driver =new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//implicit wait 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
				
				//navigate to an appl
				driver.get("https://www.makemytrip.com/");
				Thread.sleep(2000);
				
				//Ignore the popup
				driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
				Thread.sleep(2000);

				//Identify small cross
				driver.findElement(By.xpath("//span[@class=\"styles__Close-sc-1bytt3z-0 kezeYI\"]")).click();
				Thread.sleep(3000);
				
				//Identify then from textfield and pass the text
				driver.findElement(By.id("fromCity")).sendKeys("Hyderabad");
				
				//Identify the suggestion
				driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
				Thread.sleep(3000);
				
			//Identify to tf and pass the text
			    driver.findElement(By.id("toCity")).sendKeys("Mumbai");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//span[text()=\"Mumbai\"]")).click();
				Thread.sleep(3000);
				
				//Identify calender
				driver.findElement(By.id("departure")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//p[text()=\"8\"][1]")).click();
				Thread.sleep(3000);
				
				//Identify the return calendar
				driver.findElement(By.xpath("//span[text()=\"Return\"]")).click();
				
				
				driver.findElement(By.xpath("//p[text()=\"9\"][1]")).click();
				
				//close the browser
				driver.quit();
								
				
	}

}
