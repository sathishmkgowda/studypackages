package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataFetchfromExcelAmazon {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fi=new FileInputStream("./Excel/testdata.xlsx");
		
		Workbook book = WorkbookFactory.create(fi);
		
		Sheet sh = book.getSheet("Sheet1");
		
		for(int i=0;i<sh.getLastRowNum();i++)
		{
			Row ro = sh.getRow(i);
			Cell cel = ro.getCell(0);
			String val = cel.getStringCellValue();
			System.out.println(val);
			
		}
		

	}

}
