package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linktextclick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Punith");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Lavu@143");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	}

}
