package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathShaadi 
{

	public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://wwww.shaadi.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Punithgowda019@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("lavanya@143");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
