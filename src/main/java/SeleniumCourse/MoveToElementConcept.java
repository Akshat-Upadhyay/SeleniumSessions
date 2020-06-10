package SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
     
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			//driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
			
			driver.get("https://www.amazon.in/");
			
			Actions action = new Actions(driver);
			
		//  WebElement contentClick = driver.findElement(By.xpath("//a[@id='headermenudesktop']/ul/li/a"));
			
			WebElement contentClick = driver.findElement(By.className("nav-line-2"));
			action.moveToElement(contentClick).build().perform();
			
			
			Thread.sleep(3000);
			
			//driver.findElement(By.linkText("Courses")).click();
		
	}

}



//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//Action class is present in Selenium, not in Java
// We have pass a driver to the constructor.
//Action class will handle all user actions like double click, mouse hover,move to a specific element, drag and drop, right click
// When ever we use action class method, we have to use two more methods>>>>>.build and .perform

//Build means collect all the actions and then perform