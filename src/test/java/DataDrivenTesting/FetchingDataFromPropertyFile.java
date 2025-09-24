package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FetchingDataFromPropertyFile {


		public static void main(String[] args) throws IOException {
			
			
			//Step1: Converting physical file to java file 
			FileInputStream fis = new FileInputStream("./src/test/resources/data_properties");
			
			//Step2 : Create an object for  properties
			Properties prop = new Properties();
			
			//step3 : Load the data from java obj to prop obj 
			prop.load(fis);
			
			//Step4: Fetch the data from prop obj using key 
			String data = prop.getProperty("url");
			System.out.println(data);
			WebDriver driver = new ChromeDriver();
			driver.get(data);
	}

}
