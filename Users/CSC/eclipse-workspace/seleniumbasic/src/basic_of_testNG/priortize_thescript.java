package basic_of_testNG;

import org.testng.annotations.Test;

public class priortize_thescript 
{
	@Test (priority = 1)
	public void signup()
	{
		System.out.println("hi am signup");
	}
	
	@Test (priority = 2)
	public void login()
	{
		System.out.println("hi am login");
	}
	
	@Test (priority = 3)
	public void cart()
	{
		System.out.println("hi am cart");
	}
	
	@Test(priority = 4)
	public void logout()
	{
		System.out.println("hi am logout ");
	}
	
}

//in generally test annotaion will execute based on ascii values,in order to avoid that we want to execute perticular methods based on our convenient we are using priority