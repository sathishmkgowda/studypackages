package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionPresentOrNot {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/Assignment%20sele/StatesDropdown.html");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//select"));
		Select s = new Select(name);
		List<WebElement> options = s.getOptions();
		for(WebElement option:options)
		{
			String text = option.getText();
			if(text.equals("Karnataka"))
			{
				System.out.println("Present");
			}
			else
			{
				System.out.println("");
			}
		}
		
	}

}
