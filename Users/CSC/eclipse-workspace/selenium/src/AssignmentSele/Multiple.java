package AssignmentSele;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream fi=new FileInputStream("./Excel/testdata.xlsx");
		
		Workbook book = WorkbookFactory.create(fi);
		
		Sheet sh = book.getSheet("Sheet3");
		
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		for(int i=0;i<links.size();i++)
		{
			Row row = sh.createRow(i);
			Cell cel = row.createCell(0);
			cel.setCellValue(links.get(i).getAttribute("href"));
		}
		FileOutputStream fout=new FileOutputStream("./Excel/testdata.xlsx");
		book.write(fout);	
			
		}

	}

