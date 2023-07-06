package dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import SeleniumJavaAssignment.SeleAss1;

public class TypecastingArraytoTreeSet 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/Assignment%20sele/StatesDropdown.html");
		WebElement dropdown = driver.findElement(By.id("//States"));
		Select s = new Select(dropdown);
		List<WebElement> options = s.getOptions();
		ArrayList<String> arlis = new ArrayList<String>();
		for(WebElement option:options)
		{
			String text = option.getText();
			arlis.add(text);
		}
			TreeSet<String> tre = new TreeSet<String>(arlis);
			{
				System.out.println(tre);
			}

	}

}
