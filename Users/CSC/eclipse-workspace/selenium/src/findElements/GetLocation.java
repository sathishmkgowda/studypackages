package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement term = driver.findElement(By.xpath("//a[.='Games']"));
		Point loc = term.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(y);
		System.out.println(x);
		System.out.println(loc);
	}

}
