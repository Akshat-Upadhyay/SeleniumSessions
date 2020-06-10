package SeleniumCourse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Assignment.MyUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		MyUtil util = new MyUtil(driver);
		
		util.doSelectChoiceValues("choice 2","choice 2 3","choice 6 2 2");
	
		//util.doSelectChoiceValues("All");
		
//		List <WebElement> choiceList = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li[@class='ComboTreeItemChlid' or @class='ComboTreeItemParent']//span[contains(@class,'comboTreeItemTitle')]"));
//		
//		
//		for(int i=0;i<choiceList.size();i++)
//		{
//			System.out.println(choiceList.get(i).getText());
//			
//			String text = choiceList.get(i).getText();
//			
//			if(text.equals("choice 2 3"))
//				{
//				choiceList.get(i).click();
//				break;
//				}
//		}
	}
	
	

}
