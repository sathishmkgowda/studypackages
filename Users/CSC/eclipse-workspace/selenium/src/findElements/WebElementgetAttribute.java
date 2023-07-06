package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementgetAttribute {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Kannada = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		String tooltip = Kannada.getAttribute("href");
		System.out.println(tooltip);
	}

}
