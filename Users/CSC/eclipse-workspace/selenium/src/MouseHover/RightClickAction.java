package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement rgtclk = driver.findElement(By.xpath("//span[.='right click me']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.contextClick(rgtclk).perform();
	}

}
