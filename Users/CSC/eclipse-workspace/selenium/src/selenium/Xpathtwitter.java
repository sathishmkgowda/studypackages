package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathtwitter {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='apple_sign_in_button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='account_name_text_field']")).sendKeys("Punith@1019");
	}

}
