package SeleniumCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubspotLoginPageExplicitWait {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.titleContains("HubSpot"));
		
		System.out.println(driver.getTitle());
		
		By emailID = By.id("username");
		
		WebDriverWait wait = new WebDriverWait(driver,3);//Expected condition failed: waiting for presence of element
		//located by: By.id: username (tried for 3 second(s) 
		// with 500 milliseconds interval)
		wait.until(ExpectedConditions.presenceOfElementLocated(emailID));
		
		WebElement email = driver.findElement(emailID);
		email.sendKeys("Test@gmail.com");
		
//		WebElement emailID = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginbtn = driver.findElement(By.id("loginBtn"));
		
	
	}

}



// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//Expilict wait is more powerful than Implicit wait	
//WebDriverWait wait = new WebDriverWait(driver,20);----> This is explicitly wait. created the object of WebDriver Wait
// In explicit wait, if element is not found it gives Timeout exception(no such element exception will not be encountered)
// Explicit wait is not a global wait
// With explicit wait we can handle web elements and non Web Elements also.
//HENCE RECOMMENDED
