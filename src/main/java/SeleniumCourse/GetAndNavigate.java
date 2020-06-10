package SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "/Users/akshatupadhyay/Documents/Selenium/Tools/chromedriver");
		WebDriver driver = new ChromeDriver();//1. Launch the Browser
		
		//driver.get("https://www.amazon.in/");//Get Method-->Once the page is fully loaded, then only controller goes to next statement
		
		driver.navigate().to("https://www.amazon.in/"); //Navigate method will not wait for page to get loaded. title will be printed as 
		//soon as it is observed
		
		System.out.println(driver.getTitle());
		
	}

}
