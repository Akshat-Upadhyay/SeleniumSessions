//package SeleniumCourse;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class TotalLinksWithoutHidden {
//
//	public static void main(String[] args) {
//
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://www.amazon.in");
//		
//		
//		List <WebElement> totalLinks = driver.findElements(By.tagName("a"));
//		
//		System.out.println(totalLinks.size());
//		
//		
//		for(int i=0; i<totalLinks.size();i++)
//		{
//			String Total= totalLinks.get(i).getText();
//			System.out.println(Total);
//			
//			String str= Total.eq
//			
//			if(Total.isBlank())
//			{
//				
//			}
//		}
//		
//		
//	}
//
//}
