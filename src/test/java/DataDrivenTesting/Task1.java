package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		//Step1: Converting physical file to java file 
				FileInputStream fis = new  FileInputStream("./src/test/resources/Facebook_login");
				
				//Step2 : Create an object for  properties
				Properties prop = new Properties();
				
				//step3 : Load the data from java obj to prop obj 
				prop.load(fis);
				
				//Step4: Fetch the data from prop obj using key 
				String data = prop.getProperty("url");
				String m1 = prop.getProperty("email");
				String browser = prop.getProperty("browser");
				String password = prop.getProperty("password");
				
				System.out.println(data);
				
				//Launch the browser
				WebDriver driver = new ChromeDriver();
				
				driver.get(data);
				//Maximize the browser 
				driver.manage().window().maximize();
				
				//Implicitly wait 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Navigate to an application
				driver.get(data);
				Thread.sleep(2000);
				
				//Identify the mail textfeild and pass the text 
				driver.findElement(By.id("email")).sendKeys(m1);
				Thread.sleep(2000);
				
				//Identify the password and pass the text 
				driver.findElement(By.id("pass")).sendKeys(password);
				Thread.sleep(2000);
				
				//Click on the login button 
				driver.findElement(By.name("login")).click();
				Thread.sleep(2000);
				
				System.out.println(data);
				System.out.println(m1);
				System.out.println(password);
				
				//Close the browser 
				driver.quit();
	}

}
