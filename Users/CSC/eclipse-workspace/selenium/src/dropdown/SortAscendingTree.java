package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SortAscendingTree {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805646%7Cb%7Cfacebook%20create%20account%7C&placement=&creative=550525805646&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-12091220328%26loc_physical_ms%3D9062055%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI_fzUsPe2-gIV0ZlmAh0ZQwVTEAAYASAAEgKAzfD_BwE");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("month"));
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		System.out.println(count);
		TreeSet<String> treeset = new TreeSet<String>();
		for(WebElement we:options)
		{
			treeset.add(we.getText());
		}
		for(Object r:treeset)
		{
			System.out.println(r);	
		}

	}

}
