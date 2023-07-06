package findElements;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigatefuction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);;
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
