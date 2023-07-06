package basicframeworkusingtestNG_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_class {
	public static WebDriver driver1;
	public static WebDriverWait wait1;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		 driver1=new FirefoxDriver();
		 driver1.get("https://demoqa.com/text-box");
		 wait1=new WebDriverWait(driver1,1);
	}

	@AfterMethod
	public void closeapp()
	{
		driver1.close();
		
	}

}
