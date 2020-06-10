package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikipedia {

	public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.wikipedia.org/");
			
//			WebElement no_Of_Atricle = driver.findElement(By.xpath("//strong[text()='English']//following::bdi[@dir = 'ltr'][1]"));
//			
//			System.out.println(no_Of_Atricle.getText());
		
	}

}
