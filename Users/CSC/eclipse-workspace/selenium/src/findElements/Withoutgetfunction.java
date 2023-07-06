package findElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Withoutgetfunction {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.youtube.com");

	}

}
