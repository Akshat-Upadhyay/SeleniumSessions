	package SeleniumCourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {

         WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		
		List<WebElement> linkList =  driver.findElements(By.tagName("a"));
		
		 System.out.println("Total number of links present " +linkList.size());
		
		 
		 //To get total number of links on a page
		 
		 for(int i=0;i<linkList.size(); i++)
		 {
			 String text = linkList.get(i).getText();
			 System.out.println(text);
		 }
	}

}



//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//   findElement is used to find the specific element
//   findElements is used to find multiple similar kind of elements

//   List<WebElement> linkList =  driver.findElements(By.tagName("a"))--->Why Web element is passed because elements are available in 
 //  the form of Web Element and not string(All the Elements present in the web page are called Web Element) AND
//   return type id LIST..and List<WebElement>

// List is just like array list. List is the parent interface of ArraytList(can use all the methods of array list)

// List<WebElement> linkList =  driver.findElements(By.tagName("a"))-->With this an object will be created and that 
//  object is referred by Link List

// And it will collect all the tags present with 'a' tag
// List will store value based on indexing(order based)[0,1,2,3,4,.....]


