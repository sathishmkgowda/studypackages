package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchAllURLBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		WebElement btn=driver.findElement(By.id("messageWindowButton"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",btn);
		Thread.sleep(2000);
		btn.click();
		String parent=driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		for(String id:allid)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			System.out.println();
			Thread.sleep(2000);
			driver.close();
		}

	}

}
