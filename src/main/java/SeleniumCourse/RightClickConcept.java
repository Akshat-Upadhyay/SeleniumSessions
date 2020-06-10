package SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		
		Util obj = new Util(driver);

		 WebDriverManager.chromedriver().setup();
			
			 driver = new ChromeDriver();
			
			driver.get("http://swisnl.github.io/jQuery-contextMenu/demo");
			
			WebElement rightClick = driver.findElement(By.className("context-menu-one"));
			
			Actions action = new Actions(driver);
			
			action.contextClick(rightClick).build().perform();
			
			 driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-copy')]/span")).click();
			
		
		
	}

}


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//contextClick() method is used for right click