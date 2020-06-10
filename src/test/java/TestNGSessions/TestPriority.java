package TestNGSessions;

import org.testng.annotations.Test;

public class TestPriority {
	
	@Test(priority = -1)
	public void homePageTitleTest()
	{
		System.out.println("home page title test.....");
	}
	
	@Test(priority = 2)
	public void homePageHeaderTest()
	{
		System.out.println("home page header test.....");

	}
	@Test
	public void homePageLinkTest()
	{
		System.out.println("home page Link test.....");

	}
	
	@Test
	public void homePageUserTest()
	{
		System.out.println("home page User test.....");
	}
}


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


//1. If priority is not given(for some), it will execute the non priority one first

//2. always priority starts from minimum to maximum

//3. if two test cases priority is same, it will pick on alphabetical order	