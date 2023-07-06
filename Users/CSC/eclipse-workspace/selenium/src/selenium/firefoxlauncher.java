package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxlauncher {

	public static void main(String[] args)
	{
		String arg0 = "webdriver.gecko.driver";
		String arg1 = "./Softwares/geckodriver.exe";
		System.setProperty(arg0,arg1);
		FirefoxDriver d = new FirefoxDriver();
		d.close();

	}

}
