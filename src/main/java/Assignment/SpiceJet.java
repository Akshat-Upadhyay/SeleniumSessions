package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException  {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		MyUtil util = new MyUtil(driver);
		
		Actions action = new Actions(driver);
		
		By signup = By.id("ctl00_HyperLinkLogin");
	    WebElement login = driver.findElement(signup);
		
		util.explicitWaitElement(signup, 20);
		action.moveToElement(login).clickAndHold().build().perform();
		
		By spice = By.xpath("//a[text()='SpiceClub Members']");
		WebElement spiceClub= driver.findElement(spice);
		

		util.explicitWaitElement(spice, 30);
		action.moveToElement(spiceClub).clickAndHold().build().perform();
		
		
		By submenu = By.xpath("//a[text()='Sign up']");
		WebElement sub = driver.findElement(submenu);
		
		util.explicitWaitElement(submenu, 30);
		action.moveToElement(sub).click().build().perform();
		
		
		
		
	}

}
