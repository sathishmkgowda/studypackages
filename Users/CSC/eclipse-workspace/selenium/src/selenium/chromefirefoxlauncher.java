package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chromefirefoxlauncher {

	public static void main(String[] args) 
	{
		String arg0 = "webdriver.chrome.driver";
		String arg1 = "./Softwares/chromedriver.exe";
		System.setProperty(arg0, arg1);
		ChromeDriver d = new ChromeDriver();
		String arg2 = "webdriver.gecko.driver";
		String arg3 = "./Softwares/geckodriver.exe";
		System.setProperty(arg2, arg3);
		FirefoxDriver d1 = new FirefoxDriver();

	}

}
