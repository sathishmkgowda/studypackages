package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EnterdataintoExel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./Excel/testdata.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet1");
		
		Row row = sh.createRow(5);
		
		Cell cell = row.createCell(0);
		
		cell.setCellValue("Om naamo namaha");
		
		FileOutputStream fout=new FileOutputStream("./Excel/testdata.xlsx");
		
		book.write(fout);
		
		
		
		
		

	}

}
