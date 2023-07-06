package basicframeworkusingtestNG_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basicframeworkusingtestNG_Excel.generic_excel;

public class testscript1 extends base_class
{
	@Test(dataProvider = "signup credentials",dataProviderClass =dataprovider.class)
	public void signup(String firstname,String email,String current,String permanentadd)
	{
		wait2.until(ExpectedConditions.visibilityOf(driver2.findElement(By.id("userName")))).sendKeys(firstname);
		 Reporter.log("full name is entered....",true);
			
			
			driver2.findElement(By.id("userEmail")).sendKeys(email);
			Reporter.log("email is entered....",true);
		
			driver2.findElement(By.id("currentAddress")).sendKeys(current);
			Reporter.log("current address is entered....",true);
			
		
			driver2.findElement(By.id("permanentAddress")).sendKeys(permanentadd);
			Reporter.log("permanent address is entered....",true);
			
			  JavascriptExecutor js=(JavascriptExecutor) driver2;
			   js.executeScript("window.scrollBy(0,500)");
			   
			   
			   
			   driver2.findElement(By.id("submit")).click();
			   Reporter.log("all the data is submitted....",true);
			
		
	}
	

}
