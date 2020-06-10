package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	//Before--Test--After
	
	
	
	@BeforeSuite
	public void launchBrowser()
	{
		System.out.println("Launch Browser");
		
	}
	
	@BeforeTest
	public void launchURL()
	{
		System.out.println("Launch the URL");
	}
	
	@BeforeClass
	public void loginToApplication()
	{
		System.out.println("Login to Application");
	}

	@BeforeMethod
	public void goToHomePage()
	{
		System.out.println("Go to Home Page");
	}
	
	@Test(priority =1)
	public void homePageTitleTest()
	{
		System.out.println("home page title test.....");
	}
	
	@Test(priority =2)
	public void homePageHeaderTest()
	{
		System.out.println("home page header test.....");

	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("LogOut");
	}
	
	@AfterClass
	public void goToLogin()
	{
		System.out.println("Go To Login Page");
	}
	
	@AfterTest
	public void disconnectWithDB()
	{
		System.out.println("Disconnect with DB");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("Close the Browser");
	}
	
}


//>>>>>>>>>>>>>>>>.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


//
//TestNG is a JAVA testing framework used to develop and manage the test cases.
//We have to write test cases, so have to systematic, set a priority, generates a report.
//
//to write your test cases—>We can define priority, sequence.
//
//We can design and execute thru testNG
//and, then it generates a report
//
//To design the test cases we have annotations(@).


// When ever we write an annotation it should be associated with a method


// Flow of execution

//1. Before Suite-->Before Test-->Before Class-->Before Method
//2. Then it will pick first test case on the basis of alphabetical order
//3. Before every @test annotation, @Before method will be executed so (@BeforeMethod-->@Test-->@AfterMethod)-->pair will be executed
//4. @AfterClass-->@AfterTest-->@AfterSuite
//5. @Test is mandatory to execute your test cases



//Defining priority
//@Test(priority=1)
//@Test(priority=2)--->Then it will not maintain any alphabetical order



//  donot want to execute it at that moment

//  @Test(priority=1, enabled=false)


// In TEstNG we dont write if,else condition