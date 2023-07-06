package basic_of_testNG;

import org.testng.annotations.Test;

public class Executesamescript_multipletimes 
{
	@Test (priority = 1,invocationCount = 4)
	public void signup()
	{
		System.out.println("hi am signup");
	}
	
	@Test (priority = 2,invocationCount = 3)
	public void login()
	{
		System.out.println("hi am login");
	}
	
	@Test (priority = 3,invocationCount = 0)
	public void cart()
	{
		System.out.println("hi am cart");
	}
	
	@Test(priority = 4,invocationCount = 1)
	public void logout()
	{
		System.out.println("hi am logout ");
	}

}
