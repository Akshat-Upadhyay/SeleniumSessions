package SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "/Users/akshatupadhyay/Documents/Selenium/Tools/chromedriver");
		WebDriver driver = new ChromeDriver();//1. Launch the Browser
		
		driver.get("https://www.google.com/");//2. Enter URL
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());

		
		driver.navigate().back();
		System.out.println(driver.getTitle());

	
		driver.navigate().forward();
		System.out.println(driver.getTitle());

	
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();

		
	}

}
