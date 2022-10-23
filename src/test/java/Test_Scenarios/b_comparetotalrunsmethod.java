package Test_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.a_scorecardtab;
import Objects.a_totalruns;
import Objects.b_comparetotalruns;
import io.github.bonigarcia.wdm.WebDriverManager;

public class b_comparetotalrunsmethod {
	WebDriver driver;
	static int tot_run;
	
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
	public void method_totalRun() {
		a_totalruns page;
		page = new a_totalruns(driver);
		tot_run = page.totalRun();
		
	}
	
	@Test(priority=3)
	public void method_verify() {
		b_comparetotalruns page;
		page = new b_comparetotalruns(driver);
		int actualtotal = page.getTotalScore(); 
		int extras = page.getExtras();
		int calculated_total = b_comparetotalrunsmethod.tot_run + extras;
		Assert.assertEquals(actualtotal, calculated_total);
		System.out.println("Actual and calculated runs are equal.");
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
