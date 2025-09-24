package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMpage {

      //Declaration
	@FindBy(id = "name")
	private WebElement nameTF;
	
	@FindBy(name = "email")
	private WebElement emailTF;
	
	@FindBy(id = "password")
	private WebElement passwordTF;
	
	@FindBy(xpath ="//button[text()='Register']")
	private WebElement registerBtn;
	
	
	
	//Initialization
	
	public LoginPOMpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	


  //Utilization
         
    public WebElement getnameTF() {
    	return nameTF;
    }
    
    public WebElement getemailTF() {
    	return emailTF;
    }

    public WebElement getpasswordTF() {
    	return passwordTF;
    }	
    
 
    public WebElement getregisterBtn() {
    	return registerBtn;
    }	
    

}
	
		
	


