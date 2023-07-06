package basicframeworkusingtestNG_parameter_annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter_annotation_xml 
{
	@Parameters({"url","key","value"})
	@Test
	public void sample(String url,String key,String value)
	{
		System.setProperty(key, value);
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		
	}

}
