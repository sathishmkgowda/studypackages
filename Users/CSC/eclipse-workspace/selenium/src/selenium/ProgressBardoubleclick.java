package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProgressBardoubleclick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/progress-bar");
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.xpath("//button[@id='startStopButton']"));
		button.click();
		Thread.sleep(5000);
		button.click();

	}

}
