package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotAsOfWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {

		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicitly wait statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to appln
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		//fetch the login button
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		
		//Step1: take ss and store it in temp folder
		File src = login.getScreenshotAs(OutputType.FILE);
		
		//step2: Create a new emplty file
		File dest=new File("./SCREENSHOT/login.png");
		
		//step 4: copy the ss from ss to dest
		FileUtils.copyFile(src, dest);
		
		//close the browser
		driver.quit();
		

	}

}
