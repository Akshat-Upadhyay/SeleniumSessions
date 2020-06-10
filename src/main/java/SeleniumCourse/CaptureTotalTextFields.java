package SeleniumCourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTotalTextFields {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	//	List <WebElement> textbox = driver.findElements(By.tagName("input"));
		
		List <WebElement> textbox = driver.findElements(By.xpath("//input[@type='text']"));
		
		System.out.println("Total Number of text boxes " +textbox.size());
		
		for(int i=0; i<textbox.size();i++)
		{
			textbox.get(i).sendKeys("Akshat");
		}
		
	}

}
