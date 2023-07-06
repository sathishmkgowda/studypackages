package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathGoogleMaps {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/dir///@12.94336,77.627392,12z");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Mandya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Mysuru");
		driver.findElement(By.xpath("//button[@data-tooltip='Search']")).click();
		driver.findElement(By.xpath("//button[@data-tooltip='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Details']")).click();
	}
}
