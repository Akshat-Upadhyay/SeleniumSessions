package SeleniumCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_1 {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}

}




//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//1. Syntax of Xpath for single property : //htmlTag[@property1 = 'value']
//    //input[@type = 'email']
//2.  Syntax of Xpath for multiple property : //htmlTag[@property1 = 'value' and @property2 = 'value']
//   //input[@id = 'username' and @type = 'email']


//3.  >>>>>>>How to use class value    (Normally with By.class if there are multiple class it will give u error)
//REMEMBBER>>>>>>but with xpath u can give multiple class value. and we cannot give partial value. 
// We must give full value. but in by.class...it accept the partial value

//    //input[@class='form-control private-form__control login-email']



//4.  contains() in xpath: if we have a validate a particular text in that property
//    //input[contains(@property,'value')]

// //input[contains(@class,'login-email')]


//5. //input[@id='username' and contains(@class,'login-email')]


//6. contains() is also used for dynamic id's:
//  <input id = 'test_123'>
//  <input id = 'test_985'>--->these are dynamic id's

//   //input[contains(@id,'test_')]
//  (//i18n-string)[1]----->index concept


// 7. text() in xpath:---------> it can be applied only for text

// Syntax : //htmltag[text()='value']--------> we can use "" also

//   //i18n-string[text()='Forgot my password']


// 8. text() functions with contain

//  //span[contains(text(),'Show Password')]-------> you can pass the entire text or half text


//9. starts-with
// //span[starts-with(@class,'account'()]
// //span[starts-with(text(),'greetal')] 


//10. parent and child

//   //div//input[@type = 'email']----->div is the parent


//    //div//input----->direct + indirect child
//    //div/input------> direct child
