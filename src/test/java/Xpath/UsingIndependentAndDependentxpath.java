package Xpath;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIndependentAndDependentxpath {

	public static void main(String[] args) throws InterruptedException {

		//Launching the browser
				WebDriver driver = new ChromeDriver();
				
				//Maximize the window
			    driver.manage().window().maximize();
				
			      //navigate to the URL
			  		driver.get("https:www.flipkart.com/");
			  		
			  		//Identify search textfield and pass the text
			  		driver.findElement(By.name("q")).sendKeys("toy"  + Keys.ENTER);
			  		Thread.sleep(3000);
			  		
			  		
			  		//Identify the price and print
			  		WebElement price = driver.findElement(By.xpath("//a[contains(text(),'Learn With Fun Lovely')]/../a[@class=\"DMMoT0\"]/div/div[@class=\"Nx9bqj\"]"));
			  		
			  		
			  		System.out.println(price.getText());
			  		
			  		
			  		Thread.sleep(3000);
			  		
			  		//Close the browser
			  		driver.quit();
			  		
		
		
	}

}
