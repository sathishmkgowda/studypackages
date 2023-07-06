package MouseHover;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTabGoogleUsingRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement lan = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Actions act = new Actions(driver);
		act.contextClick(lan).perform();
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}
}
