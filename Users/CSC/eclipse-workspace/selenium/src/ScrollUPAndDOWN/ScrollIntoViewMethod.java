package ScrollUPAndDOWN;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollIntoViewMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		WebElement about = driver.findElement(By.xpath("//a[.='About Amazon']"));
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",about);
		Thread.sleep(2000);
		about.click();
		
		
		
	}

}
