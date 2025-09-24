package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidationMethod {

	public static void main(String[] args) throws InterruptedException {
		//Launching the browser
		WebDriver driver = new ChromeDriver();	
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate t the demowebshop appln
    	driver.get("https://demowebshop.tricentis.com/");
    	Thread.sleep(3000);
    	
    	//Identify radio button
    	WebElement radiobtn = driver.findElement(By.id("//input[@id=\"pollanswers-1\"]"));
    	radiobtn.click();
    	
    	//check whether apple checkbox is enabled on the webpage
    	
    	if (radiobtn.isSelected()) {
    		System.out.println("radiobtn is clicking in webpage");
    	} else {
    		System.out.println("radiobtn is not clicking in webpage");
    	}
    		
    		// close the browser
    		driver.quit();
    		
	}

	}
	
	




