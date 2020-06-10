package SeleniumCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
		
		WebElement element = driver.findElement(By.linkText("Sign Up"));
		
		//JavaScriptUtil.generateAlert(driver, "Hi, this is my Popup");
		
		JavaScriptUtil.refreshBrowserByJS(driver);
		
		JavaScriptUtil.clickElementByJS(element, driver);
	}

}
