package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyUtil {
	
	WebDriver driver;
	
	public MyUtil(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	/** This method is used to create a Web Element on the basis of By Locator
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator)
	{
		WebElement element=null;
		
		try {
		element =driver.findElement(locator);
		}
		
		catch (Exception e)
		{
			System.out.println("Some exception occured while creating the web Element");
			System.out.println(e.getMessage());
		}
		return element;	
	}
	
	
	/**This method is used to enter user defined text in a Web Element
	 * @param locator
	 * @param value
	 */
	public void doSendValue(By locator, String value)
	{
		try
		{
		getElement(locator).sendKeys(value);
		}
		catch(Exception e)
		{
			System.out.println("Some Exception occured while sending values to the Web Element....");
			System.out.println(e.getMessage());
			}
		}
	
	
	/** This method is used to click on the Web Element
	 * @param locator
	 */
	public void doClick(By locator)
	{
		try {
		getElement(locator).click();
		}
		catch (Exception e)
		{
			System.out.println("Some Excpetion occured while clicking on the button");
			System.out.println(e.getMessage());
		}
	}
	
	
	/** This method is used to select the drop down value provided by the user
	 * @param element
	 * @param value
	 */
	public void selectDropDownValue(WebElement element,String value)
	{
		try
		{
		Select select = new Select(element);
		select.selectByVisibleText(value);
		}
		catch(Exception e)
		{
			System.out.println("Some error occured while trying to select the drop down value");
			System.out.println(e.getMessage());
		}
	}
	
	
	/**This method is used to wait for a specific element
	 * @param locator
	 * @param time
	 */
	public void explicitWaitElement(By locator,int time)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	public static ArrayList<String> getScoreDetails(WebDriver driver, String name)
	{
		System.out.println("Details of :" +name);
		
		List<WebElement> scoreCard = driver.findElements(By.xpath("//a[contains(text(),'"+name+"')]//parent::div//following-sibling::div[contains(@class,'cb-col cb-col-8')]"));
		
		ArrayList<String> ar = new ArrayList<String>();
		
		for(int i=0;i<scoreCard.size();i++)
		{
			
			String text = scoreCard.get(i).getText();
			ar.add(text);
		}
		
		return ar;
	}
	
	
	public void doSelectRadioButton(String sex, String customText)
	{
		
		List<WebElement> radio =  driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
		
		for(int i=0;i<radio.size();i++)
		{
			WebElement radioElement = radio.get(i);
			
			 String text = radioElement.getText();
			 
			 
			 if(text.equalsIgnoreCase(sex))
			 {
				 radioElement.click();
				 
				 if(sex.equalsIgnoreCase("Custom"))
				 {
				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 WebElement select_Custom= driver.findElement(By.name("preferred_pronoun"));
				 selectDropDownValue(select_Custom, customText);
				 }
				 else
				 {
				 break;
				 }
			 }
		}
	}
	
	
	/** This method is used to select single or multiple values from a Jquery Drop Down
	 * @param choice
	 */
	public void doSelectChoiceValues(String... choice)
	{
		List <WebElement> choiceList = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li[@class='ComboTreeItemChlid' or @class='ComboTreeItemParent']//span[contains(@class,'comboTreeItemTitle')]"));

		for(int i=0;i<choiceList.size();i++)
		{
			System.out.println(choiceList.get(i).getText());
			
			String text = choiceList.get(i).getText();
			
			if(!choice[0].equalsIgnoreCase("All")) {
			
			for(int j=0;j<choice.length;j++)
			{
				if(text.equals(choice[j]))
				{
				choiceList.get(i).click();
				break;
				}
			}
			
			}
			
			else
			{
				try {
				for(int all=0;all<choiceList.size(); all++)
				{
					choiceList.get(all).click();
				}
				}
				catch(Exception e)
				{
				}
				}
			}
		}
		
	}

