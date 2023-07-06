package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathGooglemapsclickaction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='//maps.gstatic.com/tactile/omnibox/directions-2x-20150909.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Mandya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Mysuru Chamundihills");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']/../../../button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Details']")).click();
	}

}
