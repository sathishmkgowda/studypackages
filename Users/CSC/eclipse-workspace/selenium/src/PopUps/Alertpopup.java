package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		WebElement textfield = driver.findElement(By.xpath("//input[@name='cusid']"));
		textfield.sendKeys("Omnamoshivaya");
		driver.findElement(By.xpath("//input[@name='submit']")).submit();
		Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();
		

	}

}
