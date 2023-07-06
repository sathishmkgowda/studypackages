package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowAuthenticationPopup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://admin@the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[.='Basic Auth']")).click();

	}

}
