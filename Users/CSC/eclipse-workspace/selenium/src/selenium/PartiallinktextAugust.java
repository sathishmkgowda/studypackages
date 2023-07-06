package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartiallinktextAugust {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/www.google.com/doodles/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Independence Day")).click();
	}

}

