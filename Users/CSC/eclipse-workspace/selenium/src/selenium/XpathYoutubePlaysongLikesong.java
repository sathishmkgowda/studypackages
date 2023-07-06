package selenium;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathYoutubePlaysongLikesong {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Mehabhooba");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='video-title' and @title='Mehabooba Video Song (Hindi) | KGF Chapter 2 | RockingStar Yash | Prashanth Neel|Ravi Basrur|Hombale']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[.='Share']/../../../ytd-toggle-button-renderer[1]")).click();

	}

}
