package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmldummycheckbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/24-09-2022/checkboxdummy.html");
		Thread.sleep(2000);
		List<WebElement> cboxs = driver.findElements(By.xpath("//input"));
		for(WebElement cbox:cboxs)
		{
			cbox.click();
			Thread.sleep(2000);
		
		
		}	
	
	}
	
	}
