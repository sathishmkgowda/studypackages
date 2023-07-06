package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubesearchandClicksong 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("mehabooba");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Mehabooba Video Song (Hindi) | KGF Chapter 2 | RockingStar Yash | Prashanth Neel|Ravi Basrur|Hombale")).click();
	}
}