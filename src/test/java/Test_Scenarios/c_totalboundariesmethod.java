package Test_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.a_scorecardtab;
import Objects.c_totalboundaries;
import io.github.bonigarcia.wdm.WebDriverManager;

public class c_totalboundariesmethod {
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-scores/2215/ind-vs-sl-final-icc-world-cup-2011");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	public void method_clickScorecard() {
		a_scorecardtab page;
		page = new a_scorecardtab(driver);
		page.clickScoreboard();
	}
	
	@Test(priority=2)
	public void method_totalBoundaries() {
		c_totalboundaries page;
		page = new c_totalboundaries(driver);
		page.totalBoundaries();
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	

}
