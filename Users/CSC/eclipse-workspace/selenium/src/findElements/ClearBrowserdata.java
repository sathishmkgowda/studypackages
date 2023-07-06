package findElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearBrowserdata {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/gekodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
		driver.manage().deleteAllCookies();
	}

}
