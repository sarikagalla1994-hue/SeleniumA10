package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllTheSuggestions {


	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
				WebDriver driver  =  new ChromeDriver();
				
			//Maximize the window
				driver.manage().window().maximize();
				
			 //implicit wait ti 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Navigate to url
				driver.get("https://www.google.com/");
				
				driver.findElement(By.name("q")).sendKeys("sel");
				
				Thread.sleep(3000);
				
				List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(),'span')]"));
				for(WebElement ele : sugg)
				System.out.println(ele.getText());
				
				Thread.sleep(3000);
				
				//close the browser
				driver.quit();
			
				
		
		
	}

}
