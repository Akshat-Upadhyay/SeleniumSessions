package SeleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	WebDriver driver;
	
	public Util(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	/**This method is used to create Web Element on the basis of By Locator
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator)
	{
		WebElement element = null;
		try
		{
		 element = driver.findElement(locator);
		}
		catch (Exception e)
		{
			System.out.println("Some Exception occured while creating the Web Element....");
			System.out.println(e.getMessage());
		}
		return element;
		
	}
	
	/**This method is used to click on element
	 * @param locator
	 */
	public void doClick(By locator)
	{
		
		try
		{
		getElement(locator).click();
		}
		catch(Exception e)
		{
			System.out.println("Some Exception occured while clicking the Web Element....");
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	public void waitForElementPresent(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public String waitForTitlePresent(String title, int timeout)
	{
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
		
	}
    
	/**This method is used to pass values to the web Element
	 * @param locator
	 * @param value
	 */
	public void dosendKeys(By locator, String value)
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
	}




