package ScrollUPAndDOWN;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verticalScrollDown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

}
