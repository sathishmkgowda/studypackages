package frameworkusingTestNG_POM;

import org.testng.annotations.DataProvider;

public class dataproviderclass 
{
	@DataProvider(name="signup credentials")
	public static String[][] data()
	{
		String [][] arr= {{"amith","amith@gmail.com","bengalore","qspider"}};
		return arr;
	}

}
