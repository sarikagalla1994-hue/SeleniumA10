package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingHardAssert {
	@Test
	public void HardAssert() {
	
   WebDriver driver = new ChromeDriver();//launch the browser
	driver.manage().window().maximize();//maximize the window
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
	driver.get("https://www.flipkart.com/");//naviagte to application
	//using hard assert
	//Assert.assertEquals(driver.getTitle(), "Online Shopping India, Electronics, Appliances, Clothing and More Online at Flipkart.com");
	//Assert.assertNotEquals(driver.getTitle(),"Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com");
	//Assert.assertNull(driver);
	//Assert.assertNotNull(driver);;
	//Assert.assertTrue(driver.getTitle().contains("flipkart"));
	//Assert.assertFalse(driver.getTitle().contains("flipkart"));
	Assert.fail();

	
	driver.quit();//close the browser
	}

}