package HandlingFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignSwithToSnowcity {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://snowcityblr.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='nav-top-link'])[5]")).click();
		Thread.sleep(2000);
		WebElement dire = driver.findElement(By.xpath("//div[.='Directions']"));
		Actions act = new Actions(driver);
		act.moveToElement(dire);
	}

}
