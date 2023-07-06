package AssignmentSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathbySiblingsAddbooktocart2 {

	public static void main(String[] args)throws InterruptedException 
		{
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='Computing and Internet']/../following-sibling::div[3]/div[2]/input[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='Fiction']/../following-sibling::div[3]/div[2]/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
	}

}
