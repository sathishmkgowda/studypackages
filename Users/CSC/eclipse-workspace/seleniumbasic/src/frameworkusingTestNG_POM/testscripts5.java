package frameworkusingTestNG_POM;

import org.testng.annotations.Test;

public class testscripts5 extends base_class
{
	@Test(dataProvider = "signup credentials",dataProviderClass = dataproviderclass.class)
	public void signup(String fn,String ln,String mail,String pass)
	{
		 pom_class1 pmc = new pom_class1(driver);
		 pmc.reg_link();
		 pmc.gender();
		 pmc.firstname(fn);
		 pmc.lastname(ln);
		 pmc.mail(mail);
		 pmc.password(pass);
		 pmc.confirmpassw(pass);
		 pmc.regbtn();
		 
	}

}
