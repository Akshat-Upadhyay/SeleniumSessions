package SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login?loginPortalId=&loginRedirectUrl=https%3A%2F%2Fapp.hubspot.com%2Fhome-beta");
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.id("hs-eu-confirmation-button")).click();
		
		
		driver.findElement(By.id("uid-firstName-6")).sendKeys("Akshat");
		
		driver.findElement(By.id("uid-lastName-7")).sendKeys("Upadhyay");
		
		driver.findElement(By.id("uid-email-9")).sendKeys("test@gmail.com");
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
