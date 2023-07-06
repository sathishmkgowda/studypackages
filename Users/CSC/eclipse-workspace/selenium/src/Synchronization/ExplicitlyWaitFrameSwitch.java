package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitFrameSwitch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqqa.com/frames");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame1"));
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);

	}

}
