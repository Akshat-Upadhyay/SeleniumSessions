package SeleniumCourse;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		
		String date = "20-Dec-2019";
		String var[] = date.split("-");
		
		DropDownUtil.selectValueFromDropDownByText(day, var[0]);

		DropDownUtil.selectValueFromDropDownByText(month, var[1]);

		DropDownUtil.selectValueFromDropDownByText(year, var[2]);
		
//		ArrayList<String> monthList = DropDownUtil.getDropDownValues(month);
//		
//		System.out.println(monthList);
		
		
		
		
		
	}

}
