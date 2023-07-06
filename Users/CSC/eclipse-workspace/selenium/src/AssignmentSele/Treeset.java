package AssignmentSele;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Treeset {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/DD.html");
		WebElement dd = driver.findElement(By.id("BooksLang"));
		Select sel = new Select(dd);
		List<WebElement> options = sel.getOptions();
		TreeSet<String> treset = new TreeSet<String>();
		for(WebElement option:options)
		{
			String txt = option.getText();
			treset.add(txt);
			
		}
         for(String sort:treset)
         {
        	 System.out.println(sort);
         }
		
	}

}
