package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGettersMethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Launching the browser
		WebDriver driver = new ChromeDriver();	
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Navigate to the Application
		driver.get("https://www.facebook.com/");
		
		//Identify forgot password link
	     WebElement Fp_Ele =  driver.findElement(By.partialLinkText("Forgotten password?"));
	    
	    //Fetch the visable text
	    System.out.println("visable text : "+Fp_Ele.getText());
	    
	    //fetch the tagname
	    System.out.println("tag name : "+Fp_Ele.getTagName());
	   
	    //fetch the Attribute value
	    System.out.println("Attribute value : " +Fp_Ele.getAttribute("id"));

	    //Fetch the size of the element
	    System.out.println("Size (Dimension clsss)of the element: " + Fp_Ele.getSize());
	    
	    //fetch the location of the element
	    System.out.println("Location (point class) of the element : " + Fp_Ele.getLocation());
	    
	    //fetch the size and location of the element
	    System.out.println(Fp_Ele.getRect().getDimension());
	    System.out.println(Fp_Ele.getRect().getPoint()); 
	    
	    //fetch the css value of the element
	    System.out.println("css value : " + Fp_Ele.getCssValue("color"));
	    
	    // close the browswr
	    driver.quit();

	}

}
