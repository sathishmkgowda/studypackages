package AssignmentSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropCapitalAndCountry {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement cap1 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement country1 = driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement cap2 = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement country2 = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement cap3 = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement country3 = driver.findElement(By.xpath("//div[@id='box107']"));
		WebElement cap4 = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement country4 = driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement cap5 = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement country5 = driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement cap6 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement country6 = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement cap7 = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement country7 = driver.findElement(By.xpath("//div[@id='box104']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(cap1, country1).perform();
		act.dragAndDrop(cap2, country2).perform();
		act.dragAndDrop(cap3, country3).perform();
		act.dragAndDrop(cap4, country4).perform();
		act.dragAndDrop(cap5, country5).perform();
		act.dragAndDrop(cap6, country6).perform();
		act.dragAndDrop(cap7, country7).perform();

	}

}
