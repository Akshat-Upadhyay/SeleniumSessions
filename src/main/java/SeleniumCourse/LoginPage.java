package SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
//		//page objects
//		By emailID = By.id("username");
//		By password = By.id("password");
//		By loginbtn = By.id("loginBtn");
		
		

		//Util util = new Util(driver);
		
//		util.getElement(emailID).sendKeys("Test@gmail.com");
//		util.getElement(password).sendKeys("123345");
//		util.getElement(loginbtn).click();
		
//		String title = util.waitForTitlePresent("HubSpot", 10);
//		System.out.println(title);
//		
//		util.waitForElementPresent(emailID, 15);
//		
//		util.dosendKeys(emailID, "Test@gmail.com");
//		util.dosendKeys(password, "123456");
//		
//		util.waitForElementPresent(loginbtn, 5); 	
//		util.doClick(loginbtn);
		
		driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
		
		
		
		
		
		
		
		
	}

}
