package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTestWithoutBM {
	
	
WebDriver driver;
	
	@BeforeTest
	public void setup()//sort of pre-requisites that we want to do before executing test cases
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().fullscreen();//to maximize to full screen
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://app.hubspot.com/login"); 
		
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
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
	
	


