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

public class FetchtheDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Step1
		FileInputStream fis = new FileInputStream("./Excel/testdata.xlsx");
		
		//Step2
		Workbook book = WorkbookFactory.create(fis);
		
		//Step3
		Sheet sh = book.getSheet("Sheet1");
		
		//Step4
		Row row = sh.getRow(0);
		
		//Step5
		Cell cell = row.getCell(0);
		
		//Step6
		String value = cell.getStringCellValue();
		
		System.out.println(value);

	}

}
