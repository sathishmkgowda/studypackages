package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontStyle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:///www.facebook.com");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//input[@id='email']"));
		String fontstyle=text.getCssValue("font-family");
		System.out.println(fontstyle);
	}

}
