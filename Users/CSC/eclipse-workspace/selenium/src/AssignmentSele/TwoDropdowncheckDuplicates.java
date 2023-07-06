package AssignmentSele;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwoDropdowncheckDuplicates {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Selenium/HTML/Assignment%20sele/Twodropdown.html");
		Thread.sleep(2000);
		WebElement drop1 = driver.findElement(By.id("Player"));
		WebElement drop2 = driver.findElement(By.id("Txt"));
		Select S1 = new Select(drop1);
		Select S2 = new Select(drop2);
		List<WebElement> options1 = S1.getOptions();
		List<WebElement> options2 = S2.getOptions();
		for(WebElement option1:options1)
		{
			String opt1 = option1.getText();
			for(WebElement option2:options2)
			{
				String opt2 = option2.getText();
				if(opt1.equals(opt2))
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
