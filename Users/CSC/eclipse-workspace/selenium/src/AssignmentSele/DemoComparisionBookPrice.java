package AssignmentSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoComparisionBookPrice {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Computing and Internet']/../../div[3]/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Fiction']/../../div[3]/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		Thread.sleep(2000);
		String Book1 = driver.findElement(By.xpath("(//span[@class='product-subtotal'])[1]")).getText();
		Thread.sleep(2000);
		String Book2 = driver.findElement(By.xpath("(//span[@class='product-subtotal'])[2]")).getText();
		Thread.sleep(2000);
		System.out.println(Book1);
		System.out.println(Book2);
		Book1=Book1.replace(".", "");
		Book2=Book2.replace(".", "");
		int B1 = Integer.parseInt(Book1);
		int B2 = Integer.parseInt(Book2);
		if(B1<B2)
		{
			driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
			driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		}
		else
		{
			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		}
		driver.close();
	}

}
