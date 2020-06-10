package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void login()
	{
		System.out.println("Login to App");
		int i=9/0;// We are trying to fail the login method so that the dependent methods will not be executed
		           // dependent methods are : homePageTest() and contactPageTest()	
	}
	
	@Test(dependsOnMethods="login")
	public void homePageTest()
	{
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods="login")
	public void contactPageTest()
	{
		System.out.println("Contact Page Test");
	}

}


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// DependsOnMethods is used in case if we want one test to be dependent on another.