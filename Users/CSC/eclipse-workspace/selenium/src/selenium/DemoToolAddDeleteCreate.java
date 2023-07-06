package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoToolAddDeleteCreate
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='delete-record-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='delete-record-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='delete-record-3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Punith");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Lavaanya@143");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("punithgowdaar019@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='age']")).sendKeys("27");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("2000000");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='Department']")).sendKeys("Bhavani");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
