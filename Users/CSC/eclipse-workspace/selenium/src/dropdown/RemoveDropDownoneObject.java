package dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDropDownoneObject {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/Assignment%20sele/StatesDropdown.html");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//select"));
		Select s = new Select(name);
		List<WebElement> options = s.getOptions();
		ArrayList<String> arlis = new ArrayList<String>();
		for(WebElement option:options)
		{
			String text = option.getText();
			arlis.add(text);
		}
			arlis.remove(2);
			for(String a:arlis)
			{
				System.out.println(a);
			}

	}

}
