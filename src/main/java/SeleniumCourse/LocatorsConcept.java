package SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/akshatupadhyay/Documents/Selenium/Tools/chromedriver");
		WebDriver driver = new ChromeDriver();//1. Launch the Browser
		
//		driver.get("https://app.hubspot.com/login?loginPortalId=&loginRedirectUrl=https%3A%2F%2Fapp.hubspot.com%2Fhome-beta&__cf_chl_jschl_tk__=532a470dc90662fd6b26f84be65f9be05811a3e2-1581696689-0-ATrKbwDfsr4RTifH2GLiK7tguRP1gbvflrs3wvITcK_JM1TJzLL_v4rcK41GA2nP-C4A4CeTsG4XuFErgu5kxFXvDBbYD5tAXyAcGt3UADH5aMhdHyV3WUyhJrsLDwJdgAHDv307wbjKGr1tWtOZuZO7ZwZiSPW9ofMcvWq9d2Iu1dS3-x4oBo5asTgu6yZJWm2MOPHAqse2KuoizrP1so8bgsSiKMpXA-jpyCMC6oO_Ug_DbMQLFpOkajDe_otnzzMDnfR7nCw0nDOjLMZhQfRPYoLMU-56pXKfJ1qEevmw6yFVVRdrSSx-UAjQdD3HRztlYB0tqh87tdHfgxDPt29cS-v02JjMrjPqSY0s_2xjKdclOF6s8ws3NkwTqrqW8lMlh3dr7CPXRAKnGWKqGW1UPJ0nQWLJ6GZ_f_Yw5sykf8FrE9HT7IVCgSlVsuCKbw");
//		
//		Thread.sleep(5000);// used to pause your script
//		
//		
//		//1. id:-->First and fore most(it cannot be duplicate)-------------------------------->I
////		WebElement email = driver.findElement(By.id("username"));
////		email.sendKeys("Test@gmail.com");
////		
////		WebElement password = driver.findElement(By.id("password"));
////		password.sendKeys("Test@123");
////		
////		
////		WebElement button = driver.findElement(By.id("loginBtn"));
////		button.click();
////		
//		//or
//		
//		
////		driver.findElement(By.id("username")).sendKeys("Test@gmail.com");
////		driver.findElement(By.id("password")).sendKeys("Test123");
//		
//		
//		//2. name>>>>>>> Most time it will be unique----------------------------------II
//		
////		driver.findElement(By.name("Test@gmail.com")).sendKeys("1234"); //example
//		
//		//3. xpath-->mostly in case of dynamic id's--------------------------->III
//		
//	//	driver.findElement(By.xpath("//input[@id=\'username\']")).sendKeys("xpath@gmail.com");
//		
//		
//		//4. CSS Selector-------------------------->III
//		//driver.findElement(By.cssSelector("#username")).sendKeys("CSS@gmail.com");
//		
//		
//		//5. Classname----->Least priority
//		//driver.findElement(By.className("login-email")).sendKeys("classname@gmail.com");//remove the duplicate classes if any
//		
//		//6. LinkText-->only used for links
//		
//		//driver.findElement(By.linkText("Sign up")).click();// if the HTML tag is 'a' tag then only this. 
//		
//		//7. Partial Link Text
//		
//		driver.findElement(By.partialLinkText("Sign")).click();
		
	}

}
