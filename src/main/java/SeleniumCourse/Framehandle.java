package SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framehandle {

	public static void main(String[] args) {

		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//1. Create a Web Element and switch to that
		
//		WebElement frameElement = driver.findElement(By.name("main"));
//		
//		driver.switchTo().frame(frameElement);
		
		//2. Second way
		driver.switchTo().frame("main");//if name or ID is present->>>>>>>>>>>>>>>>>>>>>>>I
		//Driver is in frame now
		
		// 3. Third way
		//driver.switchTo().frame(2);//give the frame number
//		
		
		String text = driver.findElement(By.cssSelector("body")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		//driver.switchTo().parentFrame();//very rare method
		
	}

}



//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//Frames: Frame is not a popup.Frames is like a web Element available a web page, not on a java script
//frame is an overloaded method
// driver.switchTo().defaultContent();>>>>>>>>>>>>>>>>>>>>> driver will come back to the main content from frame
//driver.switchTo().parentFrame();>>>>>>>>>>>>>> to switch from child frame to parent frame





