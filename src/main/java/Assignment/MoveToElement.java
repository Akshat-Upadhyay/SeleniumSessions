package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.com/order/");
		
		Actions action = new Actions(driver);
		
		WebElement features= driver.findElement(By.xpath("//span[text()='Features']"));
		action.moveToElement(features).clickAndHold().build().perform();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement hotelModule = driver.findElement(By.xpath("//a[text()='Hotels Module']"));
		action.moveToElement(hotelModule).click().build().perform();
		
		
	}

}
