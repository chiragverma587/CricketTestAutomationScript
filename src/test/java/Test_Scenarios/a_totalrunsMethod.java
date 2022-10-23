package Test_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.a_totalruns;
import io.github.bonigarcia.wdm.WebDriverManager;

public class a_totalrunsMethod {
	
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
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}

}
