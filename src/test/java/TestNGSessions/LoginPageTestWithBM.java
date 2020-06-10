package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTestWithBM {
	
	WebDriver driver;
	SoftAssert softAssert;
	
	@BeforeMethod
	public void setup()//sort of pre-requisites that we want to do before executing test cases
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().fullscreen();//to maximize to full screen
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://app.hubspot.com/login"); 
		
		softAssert = new SoftAssert();
		
		
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		
		String title = driver.getTitle();
		System.out.println("Title of the page is " +title);
		
		Assert.assertEquals(title, "HubSpot Login");
	
	}
	
	@Test(priority=2)
	public void signupLinkTest()
	{
		
		   boolean flag= driver.findElement(By.xpath("//i18n-string[text()='Sign up']")).isDisplayed();
		   Assert.assertTrue(flag);
	
	}
	
	@Test(priority=3)
	public void loginTest()
	{
		driver.findElement(By.id("username")).sendKeys("Test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test123");
		driver.findElement(By.id("loginBtn")).click();
		
		//	Assert.assertTrue(driver.findElement(By.className("***pass the name")).isDisplayed());
		//  We can write multiple assertions
		//If any one assertion is failed, test case will be marked as Fail
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// We do not write if else condition in TestNG

// if we use "If else" in TestNG, even though else part is getting executed and test case is failed, But 
// wrt to TestNG it will be passed

//  We can give custom messages in my assert method
//  Assert.assertEquals(title, "HubSpot Login","Header Text is not matching....");
//  Assert.assertTrue(flag,"Signup link is not available");
//  Header Text is not matching.... will be displayed only if asserting is failing


// There are two types of assertions
//1. Hard Assertions : these are very strict assertions. Moment one assert is failed, the whole test case will be failed
// in a single test cases, lets say there are 5 assertions. if 3rd assertion is failed, the rest two will not be executed by TestNG
// Whole test case will be marked as Fail
// example:    Assert.assertEquals(title, "HubSpot Login");


//2. Soft Assertions : in a single test cases, lets say there are 5 assertions.
//  And if 3rd, 4th assertion are failed, TestNG will execute the rest
//  and 3rd and 4th assertion will be stored in a buffer memory and marked as Fail
// in final report, it will tell out of 5 assertion, two are failed
//And report will say test case is passed

// To create a soft assertion:

// There is a class SoftAssert and create a variable to this class. Example
//   SoftAssert.assertEquals(title, "HubSpot Login");

//REMEMBER: Always write softAssert.assertAll();  in the end
