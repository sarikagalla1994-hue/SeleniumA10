package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromEXcel {

	public static  void main(String[] args) throws IOException 
	{
		//convert physical file in to java object
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		//
		Workbook wb = WorkbookFactory.create(fis);
		//
		Sheet sh = wb.getSheet("Sheet1");
		//
		Row r = sh.getRow(1);
		//
		Cell c = r.getCell(0);
		//
		 String data =c.getStringCellValue();
		 //
		 System.out.println(data);
		
		
	}

}
