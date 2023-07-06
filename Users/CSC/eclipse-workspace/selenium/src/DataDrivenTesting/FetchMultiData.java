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

public class FetchMultiData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi=new FileInputStream("./Excel/testdata.xlsx");
		
		Workbook book = WorkbookFactory.create(fi);
		
		Sheet sh = book.getSheet("Sheet1");
		
		for(int i=0;i<sh.getLastRowNum();i++)
		{
			Row ro = sh.getRow(i);
			for(int j=0;j<ro.getLastCellNum();j++)
			{
				Cell cel = ro.getCell(j);
				String val = cel.getStringCellValue();
				System.out.println(val);
				
			}
		}

	}

}
