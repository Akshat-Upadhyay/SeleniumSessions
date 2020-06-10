package Assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricBuz {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23023/cob-vs-dol-14th-match-momentum-one-day-cup-2020");
		
		MyUtil util = new MyUtil(driver);

		
		ArrayList<String> score = MyUtil.getScoreDetails(driver, " Grant Roelofsen (wk) ");
		
		System.out.println("Total runs scored " +score.get(0));
		System.out.println("Total balls faced " +score.get(1));
		System.out.println("Total number of fours " +score.get(2));
		System.out.println("Total number of sixes" +score.get(3));
		System.out.println("Strike Rate" +score.get(4));
			
	}
	

	

}

