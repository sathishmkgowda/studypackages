package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagnameClear {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/24&23&22-08-2022/cleartwodata.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("adava")).clear();
	
	}

}
