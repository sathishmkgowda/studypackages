package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement dbl_clk = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.doubleClick(dbl_clk).perform();
		Thread.sleep(2000);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		
	}

}
