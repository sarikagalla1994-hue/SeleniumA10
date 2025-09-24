package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelectDD {


	public static void main(String[] args) throws InterruptedException {

	         //Launch the browser
				WebDriver driver  =  new ChromeDriver();
				
	    	//Maximize the window
				driver.manage().window().maximize();
				
			 //implicit wait ti 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Navigate to url
				driver.get("https://www.amazon.in/");
				
				//identify dropdown
				WebElement dd = driver.findElement(By.id("searchDropdownBox"));
				
				//create an object of select class
				Select s = new Select(dd);
				
				//select the optionwith index
				s.selectByIndex(7);
				
			     Thread.sleep(3000);
			     
			     //select option by value
			     s.selectByValue("search-alias=dvd");
			     
			     Thread.sleep(3000);
			     
			     //select option by using visable text
			     s.selectByVisibleText("Video Games");
			     
			     //fetch all the options
			      List<WebElement> options= s. getOptions();
			      
			     for(WebElement ele:options)
			     {
			   	  System.out.println(ele.getText());
			     }
			     
			      // fetch all the selected options
			      List<WebElement> list = s.getAllSelectedOptions();
			      
			      for(WebElement  ele: list)  {
			    	  System.out.println("Selected options :" +ele.getText());
			      }
			      
			      //Fetch the first selected option
			      System.out.println("First selected option :" +s.getFirstSelectedOption().getText());
			      
			      //check whether the DD is multiple select DD
			      System.out.println("Multi selected DD :" + s.isMultiple());
			      
			     // close the browser
			     driver.quit();
				
				
			
		
	}

}
