package basic_of_testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency_between_methods 
{
	@Test 
	public void signup()
	{
		System.out.println("hi am signup");
	}
	
	@Test (dependsOnMethods = "signup")
	public void login()
	{
		Assert.fail();
		System.out.println("hi am login");
	}
	
	@Test (dependsOnMethods = {"signup","login"})
	public void cart()
	{
		System.out.println("hi am cart");
	}
	

}
