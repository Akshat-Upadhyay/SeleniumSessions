package SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "/Users/akshatupadhyay/Documents/Selenium/Tools/chromedriver");
		WebDriver driver = new ChromeDriver();//1. Launch the Browser
		
		driver.get("https://www.google.com/");//2. Enter URL
		
		
		String title = driver.getTitle();//3. get the page title
		System.out.println("Title of the page is " +title);
		
		
		
		//4. Validation point
		if(title.equals("Google"))
		{
			System.out.println("Page title is correct");
		}
		else
		{
			System.out.println("Page title is not correct");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());//not used much
		
		//driver.quit();//close the browser. Do not write anything after quit()
		
		driver.close();//close the browser
		
		//System.out.println(driver.getTitle()); //Session ID is null. Using WebDriver after calling quit()?
	}

}




//*********************************************************NOTES*********************************************************************
		
//      According to Selenium, there is an interface called WebDriver. It is already developed by Selenium guys.
//   	And, different classes are present like chrome driver, IE driver etc.
//		For each browsers there are separate classes are available like chrome driver class, IE driver class which 
//		are implementing Web Driver interface.
		
//		WebDriver already has the methods present like launching a URL, interacting with the Web Elements etc
//	
//		Chrome drivers and all implement those methods and define their own body
		
//		Web Driver is an interface as there are many common methods like launching, getting title etc


//     WebDriver driver = new ChromeDriver();//Top casting: Child class object can be referred by parent interface reference variable

//      Chrome Driver is a class which is implementing Web Driver interface

//      WebDriver driver =  new Webdriver(); We will never write this as WebDriver is an interface and object cannot be created for interface
		
//      WebDriver driver =  new ChromeDriver();--> will create a session for execution
//      ChromeDriver.exe is a server, mediating between code and browser: To interact

//      gettitle() is an overridden method