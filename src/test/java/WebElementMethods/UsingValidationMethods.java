package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidationMethods {

	private static WebElement searchBtn;
	public static void main(String[] args) throws InterruptedException {
		//Launching the browser
				WebDriver driver = new ChromeDriver();	
				
				//maximize the window
				driver.manage().window().maximize();
				
				//Navigate to the Application
				driver.get("https://www.flipkart.com/");
				
				//Identify search tf
		WebElement searchTF =  driver.findElement(By.name("q"));
		
		// check whether search TF is displayed on the webpage 
		if (searchTF.isDisplayed()) {
			searchTF.sendKeys("mobile");
		}else {
	    System.out.println("Element is not displayed on the webpage");
	    
	    // Identify search button
	    driver.findElement(By.xpath(""));
	
	    // check weather the search btn id enabled if enabled click on it
	    if (searchBtn.isEnabled()) {
	    	searchBtn.click();
	    }else {
	    	System.out.println("//*name()='svg'][@width=\"4\"]");
	    	
    	// fetch the apple checkbox
	    //	driver.findElement(By.xpath("//div[text()='Apple']/../div[@class=\"XqNaEv\"]"));
	    //	apple_CB.click();
	    	
	    	//check weather the check box is selected
	    	
	    	
	    	
	    	
	    }
		}
				
	}

}
