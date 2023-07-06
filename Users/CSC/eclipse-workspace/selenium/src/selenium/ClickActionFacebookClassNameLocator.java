package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickActionFacebookClassNameLocator {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/25-08-2022/clickActionFacebookDummyPageClassNameLocator.html");
		driver.findElement(By.className("c1")).click();


	}

}
