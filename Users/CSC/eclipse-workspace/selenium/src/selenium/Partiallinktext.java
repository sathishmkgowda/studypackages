package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Partiallinktext {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/www.google.com/doodles/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Republic of Moldova")).click();
	}

}
