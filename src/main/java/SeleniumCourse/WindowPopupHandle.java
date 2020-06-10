package SeleniumCourse;

import java.util.Set;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopupHandle {

	public static void main(String[] args) {
		
	//	When ever you click on a button, a new browser tab or Browser window opens
		
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.popuptest.com/goodpopups.html");
			
			driver.findElement(By.linkText("Good PopUp #3")).click();
			
			Set<String> handles = driver.getWindowHandles();//it will give you the collection of windowID's
			
			Iterator<String> it = handles.iterator();
			
			
			String parentWindowID = it.next();
			
			System.out.println("Parent Window ID is " +parentWindowID);
			
			
			String childWindowID = it.next();
			
			System.out.println("Child Window ID is " +childWindowID);
			
			
			driver.switchTo().window(childWindowID);// driver is in Child Window now
			
			System.out.println("Child Window Title is " +driver.getTitle());//it will give title of child Window as driver is in child window
			
			//driver.quit();//Both the browser will be closed
			
			driver.close();// it will close the browser where the control of the driver is present.
	
			driver.switchTo().window(parentWindowID);// As driver is back to Parent Window, title will be of parent window
			
			System.out.println("Parent Window Title is " +driver.getTitle());
			
			driver.quit();
	
	}

}



//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// When ever we have to switch to another window, we need WindowID
//  Set<String> handles = driver.getWindowHandles();//it will give you the collection of windowID's
//   driver.getWindowHandles(); will create one object, referred by handles
//   object will have two memory allocation-->1 .for parent window ID(PID)>>>>>>2. For Child Window ID(CID)
//    Set does not maintain any indexes unlike Array(0,1,2.....) and hence cannot use FOR loop.
//		Set does not maintain any order and cannot store any duplicate values.(List can hold duplicate values)
//    Means PID and CID will be unique
//    hence we use iterator method, it will work like a loop and it is used to get the vales from those collection which does
//    not maintain the order

// When we create Iterator reference, it goes(it) and sit one location above the handles object and we need 
//  to move it one location down. We use it.next(); for that. it will automatically capture the ParentID(first location will be parent)