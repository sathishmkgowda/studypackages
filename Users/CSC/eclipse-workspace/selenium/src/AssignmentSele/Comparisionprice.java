package AssignmentSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Comparisionprice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone 11");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement Flipkartprice = driver.findElement(By.xpath("//div[.='APPLE iPhone 11 (White, 64 GB)']/../../div[2]/div[1]/div[1]"));
		String PriceF = Flipkartprice.getText();
		Thread.sleep(2000);
		System.out.println(PriceF);
		
		//amazon
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='']")).sendKeys("iphone 12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		WebElement Amazonprice = driver.findElement(By.xpath("(//span[.='Apple iPhone 12 (128GB) - Blue'])[3]/../../../following-sibling::div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]"));
		String PriceA = Amazonprice.getText();
		Thread.sleep(2000);
		System.out.println(PriceA);
		//Flipkart
		PriceF=PriceF.replace(",", "");
		PriceF=PriceF.substring(1, 6);
		int F = Integer.parseInt(PriceF);
		Thread.sleep(2000);
		//Amazon
		PriceA=PriceA.replace(",", "");
		PriceA=PriceA.substring(1, 6);
		int A = Integer.parseInt(PriceA);
		Thread.sleep(2000);
		if(F>A)
		{
			System.out.println("Amazon price is lowest when compare with flipkart");
		
		}
		else
		{
			System.out.println("Amazon price is greatere than the flipkart price");
		}

	}

}
