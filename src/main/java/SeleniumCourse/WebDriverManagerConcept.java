package SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		System.out.println(driver.getTitle());
		

		
		
	}

}





//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// We have a utility/library(free in the market) which can be used to launch the browser without any executable file configuration
//in your system---->

//System.setProperty("webdriver.chrome.driver", "/Users/akshatupadhyay/Documents/Selenium/Tools/chromedriver");
//WebDriver driver = new ChromeDriver();//1. Launch the Browser

// What if chrome is updated, we have to download new chromedriver.exe. We will have to download the latest version

// we have a new API called WeDriver Manager to solve the issue

//WebDriverManager.chromedriver().setup();>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// Add the dependency in POM.xml(https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/3.7.1)

// Webdriver manager will check the OS--> on my OS, which browser you are looking for. it will automatically download the chrome driver
//   it will take the best compatible chrome   