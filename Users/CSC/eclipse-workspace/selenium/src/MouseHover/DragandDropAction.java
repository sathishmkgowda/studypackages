package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropAction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement capital = driver.findElement(By.xpath("//div[@id='box3']"));
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("//div[@id='box103']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(capital, country).perform();
	}

}
