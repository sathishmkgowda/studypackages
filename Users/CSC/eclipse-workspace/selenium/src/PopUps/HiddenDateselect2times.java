package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDateselect2times {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		WebElement element = driver.findElement(By.id("dateOfBirthInput"));
		element.click();
		driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, October 29th, 2022']")).click();
		element.click();
		driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, November 10th, 2022']")).click();

	}

}
