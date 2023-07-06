package frameworkusingTestNG_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class1 
{
	@FindBy(xpath = "//a[.='Register")
	private WebElement reg;
	
	@FindBy(xpath = "//input[@id='gender-male']")
	private WebElement maleradio;
	
	@FindBy(id="FirstName")
	private WebElement first_name;
	
	@FindBy(id = "LastName")
	private WebElement last_name;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement passw;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirm;
	
	@FindBy(id = "register-button")
	private WebElement reg_btn;
	
	public pom_class1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void reg_link()
	{
		reg.click();
	}
	
	public void gender()
	{
		maleradio.click();
	}
	
	public void firstname(String first)
	{
		first_name.sendKeys(first);
	}
	
	public void lastname(String last)
	{
		last_name.sendKeys(last);
	}
	
	public void mail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void password(String pass)
	{
		passw.sendKeys(pass);
	}
	
	public void confirmpassw(String cpass)
	{
		confirm.sendKeys(cpass);
	}
	
	public void regbtn()
	{
		reg_btn.click();
	}
		

}
