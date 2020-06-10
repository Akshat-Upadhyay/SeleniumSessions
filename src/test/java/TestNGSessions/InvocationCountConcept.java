package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	//If we want same test case to be execute multiple times
	
	@Test(invocationCount=10)
	public void login()
	{
		System.out.println("Login to App");
	}
}
