package SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DropDownHandleSELECT {
	
	//If the HTML tag present is select, we will have to use select class present in SELENIUM

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		Select select_day = new Select(day);
//		select_day.selectByVisibleText("5");// Which value you want to select from drop down
//		
		
		select_day.selectByIndex(10);//not recommended
//		
//
//		Select select_month = new Select(month);
//		select_month.selectByVisibleText("May");
//		
//
//		Select select_year = new Select(year);
//		select_year.selectByVisibleText("1990");
//		
//		
//		selectValueFromDropDownByText(day, "5");
//		selectValueFromDropDownByText(month, "Dec");
//		selectValueFromDropDownByText(year, "2000");
		
		
	}

     
	/** This method is used to select the value from a drop down on the basis of given text
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDownByText(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	public static void selectValueFromDropDownByIndex(WebElement element, int index)
		{
			Select select = new Select(element);
			select.selectByIndex(index);
		
	}

}



//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//1. Always remember, whenever we create a Select class, we have to pass Web Element
// 2. Two important methods present in SELECT class is selectByVisibleText() and selectByIndex().
