package findElements;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Resize {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/gekodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		Point p = new Point(150, 300);
		driver.manage().window().setPosition(p);
		Dimension d = new Dimension(200, 180);
		driver.manage().window().setSize(d);
	}
}
