package basic_of_testNG;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class testscript extends base_class
{
	@Test
	public void demoqa()
	{
	   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName")))).sendKeys("vade");
	   Reporter.log("full name was entered",true);
	   
	   driver.findElement(By.id("userEmail")).sendKeys("vade@sambar.com");
	   Reporter.log("user email entered",true);
	   
	   driver.findElement(By.id("currentAddress")).sendKeys("sumadhura hotel");
	   Reporter.log("current address is entered....",true);
	   
	   driver.findElement(By.id("permanentAddress")).sendKeys("GD BAR");
	   Reporter.log("permanent address is entered....",true);
	   
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,500)");
	   
	   
	   
	   driver.findElement(By.id("submit")).click();
	   Reporter.log("all the data is submitted....",true);
	   
	   
	}

}
