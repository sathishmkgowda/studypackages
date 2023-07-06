package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/19-09-2022/Disabled.html");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//input"));
		Thread.sleep(2000);
		if(text.isEnabled())
		{
			text.sendKeys("Data pass");
		}
		else
		{
			System.out.println("I'm Disabled");
		}
	}

}
