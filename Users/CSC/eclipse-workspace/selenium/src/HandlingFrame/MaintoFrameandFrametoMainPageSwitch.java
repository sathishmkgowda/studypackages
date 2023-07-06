package HandlingFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaintoFrameandFrametoMainPageSwitch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows");
		Thread.sleep(2000);
		driver.findElement(By.id("iFrame")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("globalSqa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();

	}

}
