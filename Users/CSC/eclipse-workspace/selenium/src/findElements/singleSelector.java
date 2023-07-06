package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleSelector {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/26-09-2022/Movie%20dropdown.html");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='Movies']"));
		Select sel = new Select(dropdown);
		if(sel.isMultiple())
		{
			System.out.println("I'm multiple");
		}
		else
		{
			System.out.println("I'm single");
		}
	}


	}


