package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleOption {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			 FirefoxDriver driver = new FirefoxDriver();
			 driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/26-09-2022/Movie%20multiple%20dropdown.html");
			 Thread.sleep(2000);
			 WebElement ele = driver.findElement(By.id("Movies"));
			 Thread.sleep(2000);
			 Select s = new Select(ele);
			 Thread.sleep(2000);
			 s.selectByIndex(1);
			 Thread.sleep(2000);
			 s.selectByValue("4");
			 Thread.sleep(2000);
			 s.selectByVisibleText("Bhahubali");
			 
	}

}
