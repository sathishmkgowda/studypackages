package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextURL {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(int i=0;i<links.size();i++)
		{
			 String link = links.get(i).getAttribute("href");
			System.out.println(link);
		}

	}

}
