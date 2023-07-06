package basicframeworkusingtestNG_Excel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import basicframeworkusingtestNG_Excel.base_class;

public class testscript_1 extends base_class
{
	

	@Test
	public void signup() throws EncryptedDocumentException, IOException
	{
		String fullname = generic_excel.getdata("Sheet1", 0, 0);
		wait1.until(ExpectedConditions.visibilityOf(driver1.findElement(By.id("userName")))).sendKeys(fullname);
		 Reporter.log("full name is entered....",true);
		
		String email = generic_excel.getdata("Sheet1", 1, 0);
		driver1.findElement(By.id("userEmail")).sendKeys(email);
		Reporter.log("email is entered....",true);
		
		String currentadd = generic_excel.getdata("Sheet1", 2, 0);
		driver1.findElement(By.id("currentAddress")).sendKeys(currentadd);
		Reporter.log("current address is entered....",true);
		
		String permanadd = generic_excel.getdata("Sheet1", 3, 0);
		driver1.findElement(By.id("permanentAddress")).sendKeys(permanadd);
		Reporter.log("permanent address is entered....",true);
		
		  JavascriptExecutor js=(JavascriptExecutor) driver1;
		   js.executeScript("window.scrollBy(0,500)");
		   
		   
		   
		   driver1.findElement(By.id("submit")).click();
		   Reporter.log("all the data is submitted....",true);
		
		
		
		
	
		
		
	}

}
