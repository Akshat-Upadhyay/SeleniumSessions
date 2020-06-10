package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignupWithoutUtil {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//implicit wait

		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Akshat");
		
		
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Upadhyay");
		
		
		
		By email = By.name("reg_email__");
		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.presenceOfElementLocated(email));
		WebElement emailPhone= driver.findElement(email);
		emailPhone.sendKeys("Test@gmail.com");
		
		
		By reenterMail = By.name("reg_email_confirmation__");
		WebDriverWait wait1 = new WebDriverWait(driver,4);
		wait1.until(ExpectedConditions.presenceOfElementLocated(reenterMail));
		WebElement reenter= driver.findElement(reenterMail);
		reenter.sendKeys("Test@gmail.com");
		
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("NoWay");
		
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		

		Select select_day = new Select(day);
		Select select_month = new Select(month);
		Select select_year = new Select(year);
		
		
//		select_day.selectByVisibleText("13");
//		select_month.selectByVisibleText("Apr");
//		select_year.selectByVisibleText("1990");
		
//		String dob="13-Apr-1990";
//		String data[] = dob.split("-");
//		
//		System.out.println(data[0]);
//		System.out.println(data[1]);
//		System.out.println(data[2]);

		
		//selectValueFromDropDownday()
		
	}
	
	public void selectValueFromDropDown(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}

}
