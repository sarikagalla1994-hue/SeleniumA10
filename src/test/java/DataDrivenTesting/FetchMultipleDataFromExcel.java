package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//convert
		FileInputStream fis = new FileInputStream(".‪/Selenium_project/src/test/resources/TestData.xlsx");
		
		//Fetch thw workbook
		Workbook wb =WorkbookFactory.create(fis);
		
		//Fetch the sheet
		Sheet sh = wb.getSheet("sheet 1");
		
		for(int i=0;i<sh.getLastRowNum();i++) 
		{
			for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
			{
				String data = sh.getRow(i).getCell(j).toString();
				System.out.println(data+ " ");
				
			}
			System.out.println("");
		}
	}

}

