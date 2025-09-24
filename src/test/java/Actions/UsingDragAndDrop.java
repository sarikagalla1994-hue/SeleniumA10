package Actions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingDragAndDrop {


	public static void main(String[] args) throws InterruptedException {

		//Launching the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
	    driver.manage().window().maximize();
	    
	  //implicit wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	      //navigate to the URL
  		driver.get("https://demo.guru99.com/test/drag_drop.html");
  		
              Actions act = new Actions(driver);
      
             // Drag BANK to DEBIT SIDE (Account)
                WebElement Bank = driver.findElement(By.xpath("//*[@id='credit2']/a"));
                WebElement toDebitAccount = driver.findElement(By.xpath("//*[@id='bank']/li"));
                act.dragAndDrop(Bank, toDebitAccount).perform();
                Thread.sleep(1000);

                //  Drag SALES to CREDIT SIDE (Account)
                WebElement Sales = driver.findElement(By.xpath("//*[@id='credit1']/a"));
                WebElement toCreditAccount = driver.findElement(By.xpath("//*[@id='loan']/li"));
                act.dragAndDrop(Sales, toCreditAccount).perform();
                Thread.sleep(1000);
                
                // Drag 5000 to DEBIT SIDE (Amount)
                WebElement from5000 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
                WebElement toDebitAmount = driver.findElement(By.xpath("//*[@id='amt7']/li"));
                act.dragAndDrop(from5000, toDebitAmount).perform();
                Thread.sleep(1000);

                // Drag 5000 to CREDIT SIDE (Amount)
                WebElement from5000_2 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
                WebElement toCreditAmount = driver.findElement(By.xpath("//*[@id='amt8']/li"));
                act.dragAndDrop(from5000_2, toCreditAmount).perform();
                Thread.sleep(1000);

		        WebElement perfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
                System.out.println(perfect.getText());
                
                 // close the browser
                  driver.quit();
            
        
           
       
        
        
      
  		
  		
  		
	}

}
