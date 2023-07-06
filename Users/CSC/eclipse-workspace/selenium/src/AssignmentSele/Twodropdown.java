package AssignmentSele;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Twodropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/Assignment%20sele/Twodropdown.html");
		WebElement dropdown = driver.findElement(By.id("Player"));
		Select sel = new Select(dropdown);
		List<WebElement> options = sel.getOptions();
		ArrayList<String> arlis = new ArrayList<String>();
		WebElement dropdown1 = driver.findElement(By.id("Txt"));
		Select sel1 = new Select(dropdown1);
		List<WebElement> options1 = sel1.getOptions();
		ArrayList<String> arlis1 = new ArrayList<String>();
		for(WebElement option:options)
		{
			String text = option.getText();
			for(WebElement option1:options1)
			{
				String text1 = option1.getText();
				if(text.equals(text1))
				{
					System.out.println("Duplicates");
				}
				else
				{
					System.out.println("unique");
				}
			}
		}
	}
}