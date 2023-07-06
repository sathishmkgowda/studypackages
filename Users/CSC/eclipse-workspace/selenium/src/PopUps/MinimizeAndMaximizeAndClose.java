package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinimizeAndMaximizeAndClose {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.zomato.com");
		Thread.sleep(2000);
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_ALT);
		rbt.keyPress(KeyEvent.VK_SPACE);
		rbt.keyPress(KeyEvent.VK_N);
		rbt.keyRelease(KeyEvent.VK_ALT);
		rbt.keyRelease(KeyEvent.VK_SPACE);
		rbt.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

}
