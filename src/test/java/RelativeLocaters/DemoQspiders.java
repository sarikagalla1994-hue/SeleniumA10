package RelativeLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspiders {

	public static void main(String[] args) throws InterruptedException {

		//Launching the browser
	    WebDriver driver = new ChromeDriver();
	
	    //Maximize the window
        driver.manage().window().maximize();
	
        //navigate to the URL
  		driver.get("https://demoapps.qspiders.com/");
  		Thread.sleep(2000);
  		
  		//Click on the Quick start
  		driver.findElement(By.xpath("//button[text()=\"Quick Start\"]")).click();
  		Thread.sleep(2000);
  		
  		//Click on the Radio Button
  		driver.findElement(By.xpath("//section[text()=\"Radio Button\"]")).click();
  		Thread.sleep(2000);
  		
  		//Click on the UPI Button
  		driver.findElement(By.xpath("//input[@value=\"Upi\"]")).click();
  		Thread.sleep(2000);

  		//Click on the Home delivery
  		driver.findElement(By.xpath("//input[@value=\"home\"]")).click();
  		Thread.sleep(2000);

  		//Click on the continue Button
  		driver.findElement(By.xpath("//button[@id=\"btn\"]")).click();
  		Thread.sleep(2000);

  		//Click on Whatsapp checkbox
  		driver.findElement(By.xpath("//input[@id=\"domain_b\"]")).click();
  		Thread.sleep(2000);

  		//Click on Sandles Checkbox
  		driver.findElement(By.xpath("//input[@id=\"mode_a\"]")).click();
  		Thread.sleep(2000);

  		//Click on RTSP checkbox
  		driver.findElement(By.xpath("//input[@id=\"mode_e\"]")).click();
  		Thread.sleep(2000);

  		//Click on continue button
  		driver.findElement(By.xpath("//input[@id=\"mode_g\"]")).click();
  		Thread.sleep(2000);

  		//Click on the toggle buttion
        driver.findElement(By.xpath("//input[@id='togg']/../span")).click();
  		Thread.sleep(2000);

  		//click on the place ordered button
  		driver.findElement(By.xpath("//button[text()=\"Place Order\"]")).click();
  		Thread.sleep(2000);

  		//close the browser
  		driver.quit();
  		
  		
  		
	}

}
