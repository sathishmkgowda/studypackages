package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserClose {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(2000);
		Set<String> allids = driver.getWindowHandles();
		for(String id:allids)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			Thread.sleep(2000);
			if(url.equals("https://demoqa.com/sample"))
			{
				driver.close();
			}
		}

	}

}
