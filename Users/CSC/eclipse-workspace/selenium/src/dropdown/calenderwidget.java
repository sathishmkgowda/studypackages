package dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class calenderwidget
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		
		  driver.findElement(By.id("dateOfBirthInput")).click();
		  
		  driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		   Robot rbt = new Robot();
		   for(int i=0; i<=6; i++)
		   {
		   rbt.keyPress(KeyEvent.VK_UP);
		   rbt.keyRelease(KeyEvent.VK_UP);
		   }
		   rbt.keyPress(KeyEvent.VK_ENTER);
		   rbt.keyRelease(KeyEvent.VK_ENTER);
		   
		   driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
		   for(int i=0; i<=10; i++)
		   {
			   rbt.keyPress(KeyEvent.VK_UP);
			   rbt.keyRelease(KeyEvent.VK_UP);
		   }
		   rbt.keyPress(KeyEvent.VK_ENTER);
		   rbt.keyRelease(KeyEvent.VK_ENTER);
		   
		   driver.findElement(By.xpath("//div[@aria-label='Choose Monday, April 4th, 2011']")).click();
		
	}

}
