package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignupWithUtil {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		By firstName= By.name("firstname");
		By lastName = By.name("lastname");
		By email= By.name("reg_email__");
		By reenterMail = By.name("reg_email_confirmation__");
		By password = By.name("reg_passwd__");
		By signup = By.name("websubmit");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		MyUtil util = new MyUtil(driver);	
	
		util.explicitWaitElement(firstName,10);
		util.doSendValue(firstName,"Akshat");
		
		util.doSendValue(lastName, "Upadhyay");
		
		util.doSendValue(email, "Test@gmail.com");
		
		util.explicitWaitElement(reenterMail, 2);
		util.doSendValue(reenterMail, "Test@gmail.com");
		
		util.doSendValue(password, "No Way");
		
		util.selectDropDownValue(day,"13");
		util.selectDropDownValue(month, "Apr");
		util.selectDropDownValue(year, "1990");
		
		util.doSelectRadioButton("Male", "N/A");
	
		util.doClick(signup);
		
		
		
		
	}
	
	

}
