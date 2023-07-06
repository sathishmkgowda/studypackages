package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedcbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/19-09-2022/is%20Selectedcheckbox.html");
		Thread.sleep(2000);
		 WebElement cbox = driver.findElement(By.xpath("//input"));
		if(cbox.isSelected())
		{
			System.out.println("I'm selected");
		}
		else
		{
			cbox.click();
		}

	}

}
