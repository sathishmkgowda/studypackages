package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotAmazonMainPage {

	private static final String AmazonHomewDefect = null;

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\DELL\\Desktop\\Screenshot\\AmazonHomewDefect.jpeg");
		FileHandler.copy(src, dst);

	}

}
