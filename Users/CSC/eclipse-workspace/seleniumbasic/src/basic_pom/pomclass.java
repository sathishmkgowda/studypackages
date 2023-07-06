package basic_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomclass 
{
	@FindBy(id="email")
	private WebElement user_name;
	
	public pomclass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void username(String user)
	{
		user_name.sendKeys(user);
	}
}
