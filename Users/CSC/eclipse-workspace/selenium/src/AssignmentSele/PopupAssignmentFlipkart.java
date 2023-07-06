package AssignmentSele;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupAssignmentFlipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone11");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 11 (White, 128 GB)']")).click();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		Iterator<String> I1=handles.iterator();
		while(I1.hasNext())
		{
			String childwindow = I1.next();
			if(parent.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				System.out.println(driver.switchTo().window(childwindow).getTitle());
				
			}}
		String childwindow = null;
		driver.switchTo().window(childwindow);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("560058");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Check']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		}
				

	}


