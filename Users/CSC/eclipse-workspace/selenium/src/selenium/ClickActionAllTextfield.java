package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.util.security.Password;

public class ClickActionAllTextfield {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/AllsearchLoginpagefacebook.html");
		driver.findElement(By.id("user")).sendKeys("Punith");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("gowda");
		Thread.sleep(2000);
		driver.findElement(By.id("cbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("female")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("link")).click();
	}

}
