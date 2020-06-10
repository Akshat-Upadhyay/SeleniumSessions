package SeleniumCourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValuesSELECT {

	public static void main(String[] args) {

		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));	
		
		
		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);

	}
	
	
	/**
	 * This method is used to get all the values from drop down
	 * @param element
	 */
	public static void getDropDownValues(WebElement element)
	{
		System.out.println("=====================================================");
         Select select = new Select(element);
		
		//How many values present in the drop Down 
		
		List <WebElement> dropdownList = select.getOptions();
		
		System.out.println("Total number of values in the drop down "+dropdownList.size());
		
		for(int i=0; i<dropdownList.size();i++)
		{
			System.out.println(dropdownList.get(i).getText());
			
		}
		
		
	
	}

}
