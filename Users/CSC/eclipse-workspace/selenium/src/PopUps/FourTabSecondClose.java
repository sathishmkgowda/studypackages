package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FourTabSecondClose {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Robot rbt=new Robot();
		for(int i=0;i<3;i++)
		{
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_T);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
			rbt.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
		}
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> arl=new ArrayList<String>(allid);
		String id = arl.get(1);
		driver.switchTo().window(id);
		Thread.sleep(2000);
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.close();
	}
}
