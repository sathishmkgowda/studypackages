package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		//1]id()
		driver.findElement(By.id(""));
		
		//2]name()
		driver.findElement(By.name(""));
		
		//3]className()
		driver.findElement(By.className(""));
		
		//4]tagname()
		driver.findElement(By.tagName(""));
		
		//5]linktext()
		driver.findElement(By.linkText(""));
		
		//6]partiallinktext()
		driver.findElement(By.partialLinkText(""));
		
		//7]css selector
		driver.findElement(By.cssSelector(""));   //tag[attribute name =attribute value] in css id=#,class=.
		
		//8] xpath()
		driver.findElement(By.xpath(""));       //tagname[@attribute name =attribute value]
	}

}
