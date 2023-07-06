package AssignmentSele;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSortByAsending {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/DD.html");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("BooksLang"));
		Select sel = new Select(dd);
		List<WebElement> options = sel.getOptions();
		ArrayList<String> arr = new ArrayList<String>();
		for(WebElement option:options)
		{
			String txt = option.getText();
			//System.out.println(txt);9
	        arr.add(txt);
		}
		   Collections.sort(arr,Collections.reverseOrder());
		   for(String sort:arr)
		   {
			   System.out.println(sort);
		   }
		
	}

}
