package AssignmentSele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByusingForloop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/DD.html");
		WebElement DD = driver.findElement(By.id("BooksLang"));
		Select  sel=new Select(DD);
		List<WebElement> options = sel.getOptions();
		ArrayList<String> arr = new ArrayList<String>();
		for(WebElement option:options)
		{
			String txt = option.getText();
			arr.add(txt);
		}
		Collections.sort(arr);
		for(int i=arr.size()-1; i>=0; i--)
		{
			String txtarr = arr.get(i);
			System.out.println(txtarr);
		}

	}

}
