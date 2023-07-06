package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllURLUsingForLoop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(int i=0;i<=links.size()-1;i++)
		{
			WebElement a = links.get(i);
			String url = a.getAttribute("href");
			System.out.println(url);
		}
		

	}

}
