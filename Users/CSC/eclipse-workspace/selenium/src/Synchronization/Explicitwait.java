package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebDriverWait wait=new WebDriverWait(driver, 5);
		WebElement un=driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(un)).sendKeys("random data");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("pass")))).sendKeys("random pass");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("login")))).click();
	}

}
