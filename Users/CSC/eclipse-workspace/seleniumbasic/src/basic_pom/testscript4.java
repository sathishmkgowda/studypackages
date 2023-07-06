package basic_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testscript4 
{
	@Test
	public void script() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		pomclass pmc = new pomclass(driver);
		pmc.username("hi");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		pmc.username("hello");
		
	}

}
