package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/upload-download");
		Thread.sleep(2000);
		WebElement browser = driver.findElement(By.id("uploadFile"));
		Thread.sleep(2000);
		browser.sendKeys("C:\\Users\\DELL\\Desktop\\testdata.xlsx");
	}
}
