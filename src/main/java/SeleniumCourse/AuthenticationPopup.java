package SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopup {

	public static void main(String[] args) {

		//Authentication pop up is not a Java Script pop up
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			String username = "admin";
			String password = "admin";
			
//			driver.get("http://admin:admin@www.londonfreelance.org/courses/frames/index.html");
//			//First admin is the User name
//			//Second admin is password
			
			
			
			driver.get("http://"+username+":"+password+"@www.londonfreelance.org/courses/frames/index.html");
		
		
	}

}
