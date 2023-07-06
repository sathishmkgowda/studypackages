package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.io.QuietException;

public class DragAndDropCountryCapitalUsingFORLOOP {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		String[] capital={"box1","box2","box3","box4","box5","box6","box7"};
		String[] country={"box101","box102","box103","box104","box105","box106","box107"};
		for(int i=0;i<capital.length;i++)
		{
			WebElement cap = driver.findElement(By.id(capital[i]));
			WebElement ctry = driver.findElement(By.id(country[i]));
			String cap1 = cap.getText();
			String ctry1 = ctry.getText();
			Actions act = new Actions(driver);
			act.dragAndDrop(cap, ctry).perform();
			System.out.println(cap1 +" capital of "+ctry1);
		}
		
			Thread.sleep(2000);
			driver.quit();
		
		

	}

}
