package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReverselinkusingForLoop {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		for(int i=links.size()-1;i>=0;i--)
		{
			WebElement link = links.get(i);
			String text = link.getText();
			System.out.println(text);
		}

	}

}
