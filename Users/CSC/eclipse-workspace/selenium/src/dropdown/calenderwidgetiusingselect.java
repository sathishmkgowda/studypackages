package dropdown;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class calenderwidgetiusingselect 
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		
		  driver.findElement(By.id("dateOfBirthInput")).click();
		  
		  WebElement addd1 = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		  
		  Select sel=new Select(addd1);
		  sel.selectByValue("3");
		  
		  WebElement addd2 = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		  Select sel1=new Select(addd2);
		  sel1.selectByValue("1996");
		  
		  driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, April 4th, 1996']")).click();
	}

}
