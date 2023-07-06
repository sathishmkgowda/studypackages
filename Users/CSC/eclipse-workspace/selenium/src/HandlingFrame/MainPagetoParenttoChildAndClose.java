package HandlingFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPagetoParenttoChildAndClose {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		WebElement Pf = driver.findElement(By.xpath("//body[.='Parent frame']"));
		String parent = Pf.getText();
		System.out.println(parent);
		driver.switchTo().frame(0);
		WebElement Cf = driver.findElement(By.xpath("//p[.='Child Iframe']"));
		String child = Cf.getText();
		System.out.println(child);
		driver.switchTo().defaultContent();
		driver.close();

	}

}
