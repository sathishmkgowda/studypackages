package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathComposeYahoo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://in.mail.yahoo.com/d/folders/1?.intl=in&.lang=en-IN&pspid=2114723002&activity=header-mail");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("lavubaby0143@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("2201430143");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("mugutibaby0143@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-test-id='btn-cc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Be happy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Shubhodaya, Good day");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Send']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Profile image'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Sign out']")).click();
		Thread.sleep(2000);
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=ym&activity=header-mail&pspid=2114723002&done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%2F%3F.intl%3Din%26.lang%3Den-IN%26pspid%3D2114723002%26activity%3Dheader-mail&add=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("mugutibaby0143@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("0143014322");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-test-id='left-rail-scrolling-container']/div[1]/ul[1]/li[1]")).click();
	}
}
