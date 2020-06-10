package SeleniumCourse;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {
	
	
	  
		/** This method is used to select the value from a drop down on the basis of given text
		 * @param element
		 * @param value
		 */
		public static void selectValueFromDropDownByText(WebElement element, String value)
		{
			Select select = new Select(element);
			select.selectByVisibleText(value);
			
		}
		
		/** This method is used to select the value from a drop down on the basis of given index
		 * @param element
		 * @param index
		 */
		public static void selectValueFromDropDownByIndex(WebElement element, int index)
			{
				Select select = new Select(element);
				select.selectByIndex(index);
			
		}
		
		

		/**
		 * This method is used to get all the values from drop down
		 * @param element
		 */
		public static ArrayList<String> getDropDownValues(WebElement element)
		{
			System.out.println("=====================================================");
	         Select select = new Select(element);
			
			//How many values present in the drop Down 
			
			List <WebElement> dropdownList = select.getOptions();
			
			System.out.println("Total number of values in the drop down "+dropdownList.size());
			
			ArrayList<String> ar = new ArrayList<String>();
			
			
			for(int i=0; i<dropdownList.size();i++)
			{
				String text = dropdownList.get(i).getText();
				//System.out.println();
				
				ar.add(text);
			}
			return ar;
		}
			
			
			
			
			/**This method is used to select the select the drop down values with out select class
			 * @param driver
			 * @param locator
			 * @param value
			 */
			public static void selectDropDownValueWithoutSelect(WebDriver driver, String locator, String value)

			{
				
				List<WebElement> dropList=	driver.findElements(By.xpath(locator));
				
				  System.out.println(dropList.size());
				  
				  
				  for(int i=0; i<dropList.size();i++)
				  {
					  String Text = dropList.get(i).getText();
					  
					  System.out.println(Text);
					  
					  
			          if(Text.equals(value))
			          {
			        	  dropList.get(i).click();
			        	 break;
			          }
				
				
			}
}
}
