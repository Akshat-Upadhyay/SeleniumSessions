package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HBR {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://hbr.org/");
		
		By signup = By.cssSelector("span.baseline-shift-down-more"); 
		By emailID = By.name("emailAddress");
		
		driver.findElement(signup).click();
		driver.findElement(emailID).sendKeys("akshat.taj@gmail.com");
		
	}

}
