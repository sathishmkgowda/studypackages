package AssignmentSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookMaleradiobutton {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		WebElement rdbutton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		Thread.sleep(2000);
		rdbutton.click();
		if(rdbutton.isSelected())
		{
			System.out.println("I'm selected");
		}
		else
		{
			System.out.println("I'm  not selected");
		}

	}


	}

