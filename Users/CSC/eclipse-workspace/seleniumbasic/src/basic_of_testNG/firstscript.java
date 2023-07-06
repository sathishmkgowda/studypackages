package basic_of_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class firstscript 
{
	@Test
	public void test()
	{
		Reporter.log("begining of frame work",true);
	}

	@Test
	public void test1()
	{
		Reporter.log("end of frame work",false);
	}
}
