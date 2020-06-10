package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
//		
//		Select select = new Select(dropDown);
//		
//		select.selectByVisibleText("Amazon Fashion");
		
		
	}

}
