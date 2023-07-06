package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckdupliByUsingFORLOOP {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/Assignment%20sele/Twodropdown.html");
		Thread.sleep(2000);
		WebElement dropdown1 = driver.findElement(By.id("Player"));
		WebElement dropdown2 = driver.findElement(By.id("Txt"));
		Select s1 = new Select(dropdown1);
		Select s2 = new Select(dropdown2);
		List<WebElement> options1 = s1.getOptions();
		List<WebElement> options2 = s2.getOptions();
		for(int i=0;i<options1.size();i++)
		{
			WebElement option1 = options1.get(i);
			String text1 = option1.getText();
			for(int j=0;j<options2.size();j++)
			{
				WebElement option2 = options2.get(j);
				String text2 = option2.getText();
				if(text1.equals(text2))
				{
					System.out.println("Duplicates");
				}
				else
				{
					System.out.println("Unique");
				}
			}
			
		}

	}

}
