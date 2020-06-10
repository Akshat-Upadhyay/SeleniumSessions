package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	By username = By.id("username");
	By password = By.id("password");
	By login= By.id("loginBtn");
	By signUp = By.linkText("Sign up");
	By homePageHeader = By.xpath("//h1[@class = 'private-page__title']");
	
	
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void verifysignUpLinkTest()
	{
		Assert.assertTrue(driver.findElement(signUp).isDisplayed());
	}
	
	@Test(priority = 2)
	public void verifyPageTitleTest()
	{
		String title = driver.getTitle();
		System.out.println("Title of the page is "+title);
		Assert.assertEquals(title, "HubSpot Login");
	}

	
	@Test(priority = 3)
	public void loginTest()
	{
		driver.findElement(username).sendKeys("akshat.taj@gmail.com");
		driver.findElement(password).sendKeys("Hubspot@1234");
		driver.findElement(login).click();
		
		String text = driver.findElement(homePageHeader).getText();
		System.out.println("Home Page header is "+text);
		
		Assert.assertEquals(text, "Sales Dashboard");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}


//*****************************************NOTES************************************************************
// Annotation is a special keyword declared with @
// @Before Test says--------> before all your test execute this
//@Test is used to write the test cases
