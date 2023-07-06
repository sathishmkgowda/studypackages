package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromelauncher {

	public static void main(String[] args) 
	{
		String arg0 = "webdriver.chrome.driver";
		String arg1 = "./Softwares/chromedriver.exe";
		System.setProperty(arg0, arg1);
		ChromeDriver d = new ChromeDriver();
        d.close();
	}

}
