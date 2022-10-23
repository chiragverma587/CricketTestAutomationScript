package Test_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.a_totalruns;
import Objects.b_comparetotalruns;
import Objects.c_totalboundaries;
import Objects.d_runoutplayer;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testmethods {
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
	
	@Test(priority=1, description="a")
	public void method_clickScorecard() {
		a_totalruns page;
		page = new a_totalruns(driver);
		page.clickScoreboard();
	}
	
	@Test(priority=2, description="a")
	public void method_totalRun() {
		a_totalruns page;
		page = new a_totalruns(driver);
		tot_run = page.totalRun();
		
	}
	
	@Test(priority=5, description="b")
	public void method_verify() {
		b_comparetotalruns page;
		page = new b_comparetotalruns(driver);
		int actualtotal = page.getTotalScore(); 
		int extras = page.getExtras();
		int calculated_total = testmethods.tot_run + extras;
		Assert.assertEquals(actualtotal, calculated_total);
	}
	
	@Test(priority=3, description="c")
	public void method_totalBoundaries() {
		c_totalboundaries page;
		page = new c_totalboundaries(driver);
		page.totalBoundaries();
	}
	
	@Test(priority = 4, description="d")
	public void method_runoutPlayer() {
		d_runoutplayer page;
		page = new d_runoutplayer(driver);
		page.runoutPlayer();
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
