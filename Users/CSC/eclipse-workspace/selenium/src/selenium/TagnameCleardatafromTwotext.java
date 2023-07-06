package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameCleardatafromTwotext 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/25-08-2022/TagnamecleardatafromTwotext.html");
		Thread.sleep(2000);
		driver.findElement(By.id("field")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("field")).clear();
	
	}

}
