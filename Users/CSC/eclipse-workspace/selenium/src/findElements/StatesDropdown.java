package findElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StatesDropdown {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/Assignment%20sele/StatesDropdown.html");
		WebElement dropdown = driver.findElement(By.id("States"));
		Select s = new Select(dropdown);
		ArrayList<String> P=new ArrayList<String>();
		ArrayList<String> L=new ArrayList<String>();
		if(s.isMultiple())
		{
			System.out.println("I'm multi select dropdown");
			s.selectByIndex(2);
			WebElement S1 = driver.findElement(By.xpath("//option[@value='c']"));
			String text = S1.getText();
			P.add(text);
			s.selectByValue("g");
			WebElement S2 = driver.findElement(By.xpath("//option[@value='g']"));
			String text1 = S2.getText();
			P.add(text1);
			s.selectByVisibleText("Karanataka");
			S2=driver.findElement(By.xpath("//option[@value='a']"));
			String text2 = S2.getText();
			P.add(text2);
			s.selectByIndex(4);
			WebElement S3 = driver.findElement(By.xpath("//option[@value='d'"));
			String text3 = S3.getText();
			P.add(text3);
			for(String R:P)
			{
				System.out.println(R);
			}
			List<WebElement> option = s.getOptions();
			for(WebElement we:option)
			{
				String T1 = we.getText();
				L.add(T1);
				
			}
			for(String all:L)
			{
				System.out.println(all);
			}
			L.retainAll(P);
			for(String all:L)
			{
				System.out.println(all);
			}
			for(WebElement we:option)
			{
				String T1 = we.getText();
				L.add(T1);
			}
			L.remove(P);
			for(String all:L)
			{
				System.out.println(all);
			}
		}
			else
			{
				System.out.println("single");
			}	
		
	}
}

