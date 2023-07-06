package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import selenium.chromefirefoxlauncher;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement dubclk = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.doubleClick(dubclk).perform();
	}

}
