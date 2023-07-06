package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeybordAction {

	private static final CharSequence ADVANCESELE = null;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("punithgowda");
		Thread.sleep(2000);
		username.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		username.sendKeys(Keys.BACK_SPACE);
		
		
	}
	

}
