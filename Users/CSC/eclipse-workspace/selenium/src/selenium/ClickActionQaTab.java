package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickActionQaTab {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("htts://demoqa.com/tabs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Origin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.='Use']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
