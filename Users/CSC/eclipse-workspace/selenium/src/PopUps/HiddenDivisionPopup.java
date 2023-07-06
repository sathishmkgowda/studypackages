package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, October 30th, 2022']")).click();

	}

}
