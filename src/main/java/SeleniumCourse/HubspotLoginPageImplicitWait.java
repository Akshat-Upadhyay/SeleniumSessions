package SeleniumCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubspotLoginPageImplicitWait {

	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());// You will get the title of the waiting page not the original
		
		WebElement emailID = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbtn = driver.findElement(By.id("loginBtn"));

		emailID.sendKeys("Test@gmail.com");
		
	}

}



//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//applied ONLY to all the elements(not for Title,URL) present in the web page. Also called as Global Wait or dynamic wait
//if you have 1000 elements, implicit wait will be applied to all
//Clock resets after one element is found
//should be used after launching the URL
//Then moment element is available, it will be actioned
//Timeout() is applied on driver. Driver is having the property of implicit wait
//REMEMBER>>>>>> Web element does not have that property of timeout();

// if time out is less than expected time, then script will fail.


// To cancel/nullify the wait---> driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);


