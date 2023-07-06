package AssignmentSele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YhoohoMailImplicitlytimemethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://in.mail.yahoo.com/d/folders/1?.intl=in&.lang=en-IN&pspid=2114723002&activity=header-mail");
		driver.findElement(By.xpath("//input[@id='login-username']")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("lavubaby0143@yahoo.com");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("2201430143");
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		driver.findElement(By.xpath("//input[@id='message-to-field']")).click();
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("mugutibaby0143@yahoo.com");
		driver.findElement(By.xpath("//button[@data-test-id='btn-cc']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Be happy");
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Shubhodaya, Good day");
		driver.findElement(By.xpath("//span[.='Send']")).click();
		driver.findElement(By.xpath("(//img[@alt='Profile image'])[1]")).click();
		driver.findElement(By.xpath("//span[.='Sign out']")).click();
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=ym&activity=header-mail&pspid=2114723002&done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%2F%3F.intl%3Din%26.lang%3Den-IN%26pspid%3D2114723002%26activity%3Dheader-mail&add=1");
		driver.findElement(By.xpath("//input[@id='login-username']")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("mugutibaby0143@yahoo.com");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("0143014322");
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		driver.findElement(By.xpath("//div[@data-test-id='left-rail-scrolling-container']/div[1]/ul[1]/li[1]")).click();


	}

}
