package AssignmentSele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwoDropdownDuplicateByUsingforloop {

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
		for(int i=0;i<=options1.size()-1;i++)
		{
			WebElement opt1 = options1.get(i);
			String text1 = opt1.getText();
			for(int j=0;j<=options2.size()-1;j++)
			{
				WebElement opt2 = options2.get(j);
				String text2 = opt2.getText();
				if(text1.equals(text2))
				{
					System.out.println("Dupli");
				}
				else
				{
					System.out.println("Uni");
				}
			}
		}

	}

}
