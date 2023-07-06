package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssSelectorInsta {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Punith");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Lavanya@143");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
