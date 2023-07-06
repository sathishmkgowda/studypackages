package AssignmentSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class MoneyControl {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		Thread.sleep(2000);
		WebElement MostPrice = driver.findElement(By.xpath("//a[.='Most Active']/../../../div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[2]"));
		String MPrice = MostPrice.getText();
		System.out.println(MPrice);
		WebElement send = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		send.sendKeys("Infy");
		driver.findElement(By.xpath("(//a[@class='top_search_btn'])[1]")).click();
		WebElement Infy = driver.findElement(By.xpath("(//a[.='Trade'])[1]/../div[2]"));
		String value = Infy.getAttribute("data-numberanimate-value");
		System.out.println(value);
	}

}
