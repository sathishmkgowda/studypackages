package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathbySiblingsAddbooktocart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='14.1-inch Laptop']/../following-sibling::div[3]/div[2]/input[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[.='Build your own cheap computer']/../following-sibling::div[3]/div[2]/input")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();	
	}
}
