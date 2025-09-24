package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDD {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver  =  new ChromeDriver();
		
	//Maximize the window
		driver.manage().window().maximize();
		
	 //implicit wait ti 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to url
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		//identify dropdown element
		WebElement multi_ssDD = driver.findElement(By.id("select-multiple-native"));
		
		
		//create an object of select class
		Select s = new Select(multi_ssDD);
		
		//select the option using index,value and visable text
		s.selectByIndex(2);
		Thread.sleep(3000);
		
		s.selectByValue("White Gold Plated Princess");
		Thread.sleep(3000);

		s.selectByVisibleText("SanDisk SSD PLUS 1TB...");
		
		// fetch all the options
	      List<WebElement> options= s. getOptions();
	      for(WebElement ele:options)
		     {
		   	  System.out.println("All options :" +ele.getText());
		     }
	        Thread.sleep(3000);
	      
	     // fetch all the selected options
	      List<WebElement> selected = s.getAllSelectedOptions();
	      for(WebElement  ele: selected)  {
	    	  System.out.println("Selected options :" +ele.getText());
	      }
	        Thread.sleep(3000);
	        
	        //Fetch the first selected option
		      System.out.println("First selected option :" +s.getFirstSelectedOption().getText());
		      
		      //check whether the DD is multiple select DD
		      System.out.println("Multi selected DD :" + s.isMultiple());
		      
		      //deselect the options
		      
		      
		      
		      s.deselectAll();
		      
		      //close thne browser
		      driver.quit();
		      

	      
	      
	      
	      
	      
	      

		
		
		
		
		
		
		
		
		
		
	}

}
