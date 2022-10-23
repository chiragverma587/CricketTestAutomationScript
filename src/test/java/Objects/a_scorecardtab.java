package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class a_scorecardtab {
	
	WebDriver driver;
	
	public a_scorecardtab(WebDriver driver) {
		this.driver = driver;
	}
	By scoreboard = By.xpath("//a[@title='India vs Sri Lanka, Final Scorecard']");
	
	public void clickScoreboard() {
		try {
			driver.findElement(scoreboard).click();
		} catch(Exception e) {
			System.out.println("Exceptions caught"+ e.getMessage());
		}
		
	}

}
