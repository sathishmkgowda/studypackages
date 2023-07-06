package basicframeworkusingtestNG_dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_class 
{
	public static WebDriver driver2;
	public static WebDriverWait wait2;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		 driver2=new FirefoxDriver();
		 driver2.get("https://demoqa.com/text-box");
		 wait2=new WebDriverWait(driver2,1);
	}

	@AfterMethod
	public void closeapp()
	{
		driver2.close();
		
	}

}
