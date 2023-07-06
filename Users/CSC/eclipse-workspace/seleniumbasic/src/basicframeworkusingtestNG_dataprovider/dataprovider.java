package basicframeworkusingtestNG_dataprovider;

import org.testng.annotations.DataProvider;

public class dataprovider 
{
	@DataProvider(name="signup credentials")
	public static String[][] data()
	{
		String [][] arr= {{"amith","amith@gmail.com","bengalore","qspider"}};
		return arr;
	}

}
