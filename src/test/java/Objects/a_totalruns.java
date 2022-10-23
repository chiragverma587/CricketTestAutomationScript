package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class a_totalruns {
	
	WebDriver driver;
		
		public a_totalruns(WebDriver driver) {
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
		
		public int  totalRun() {
			try {
				Actions action = new Actions(driver);
				action.sendKeys(Keys.ARROW_DOWN);
				action.perform();
				int total_run = 0;
				
				for(int i=3;i<=10;i++) {
					WebElement run1 = driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div["+i+"]/div[3]"));
					total_run = total_run + Integer.parseInt(run1.getText());
				}
				
				
				System.out.println("Total score: "+total_run);
				return total_run;
			} catch (Exception e) {
				System.out.println("Exceptions caught"+ e.getMessage());
				return 0;
			}
		}
}
