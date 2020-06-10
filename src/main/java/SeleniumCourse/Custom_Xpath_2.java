package SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_2 {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
	}

}



//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//>>>>>>>>>>>>LInk Used: https://www.crmpro.com/>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


//        1. FOLLOWING
//  //div[@class='private-form__input-wrapper']//following::div-->go to parallel hierarchy(not the child one)

//    So Basically which ever tag is mentioned after following, it will check that

//  //div[@class='input-group']/input[@name='username']--> immediate child is input

//                      OR

//    //div[@class='input-group']//following::input[@name='username']

//                      OR

//   (//div[@class='input-group']//following::input)[1]


//       2. PRECEDING(Before), PRECEDING-SIBLING

//   //input[@name='username']//preceding::div


//      3. PARENT-->immediate parent(from child to parent)

//    //input[@name='username']//parent::div

//      4. CHILD-->immediate child

//    //div[@class='input-group']//child::input[@name='username']

//     5. ANCESTOR-->highest parent

//   //div[@class='input-group']//ancestor::div[@class='container']


// //a[text()='Ashish pal']




// 6. Reserving Xpath:--->traversing from child to parent-->grand parent to super parent-->in DOM

//    //input[@id='username']/../../../../../../../../../..---(With every(/..), we go to one parent above

//      OR --->We can use //.. also      

