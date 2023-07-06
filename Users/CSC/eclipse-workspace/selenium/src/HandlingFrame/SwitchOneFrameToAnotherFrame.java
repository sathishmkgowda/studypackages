package HandlingFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchOneFrameToAnotherFrame {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		WebElement f1text1 = driver.findElement(By.xpath("//h1[contains(.,'This')]"));
		String text1 = f1text1.getText();
		System.out.println(text1);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame2);
		WebElement f2text = driver.findElement(By.xpath("//h1[contains(.,'This')]"));
		String text2 = f2text.getText();
		System.out.println(text2);
		driver.switchTo().defaultContent();
		driver.close();
		
		
		
		
		
		

	}

}
