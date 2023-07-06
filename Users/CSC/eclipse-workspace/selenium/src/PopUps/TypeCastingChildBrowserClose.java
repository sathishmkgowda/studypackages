package PopUps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TypeCastingChildBrowserClose {

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
		Set<String> allid = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(allid);
		String id = list.get(1);
		driver.switchTo().window(id);
		Thread.sleep(2000);
		driver.close();

	}

}
