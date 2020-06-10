package SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) {

		
		//For file upload scenarios, the must condition is : in HTML tag 'type' = 'file' values should be present
		//if it is not present, we cannot handle file upload with selenium, then we will have to use sikulli or some other tool.
		//else go to UI developer to add tag 'Type' = 'file' value
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		driver.findElement(By.name("upfile")).sendKeys("/Users/akshatupadhyay/Documents/5102713.pdf");
	}

}
