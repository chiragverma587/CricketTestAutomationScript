package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class b_comparetotalruns {
	
	WebDriver driver;
		
		public b_comparetotalruns(WebDriver driver) {
			this.driver = driver;
		}
		By extras = By.xpath("//*[@id=\"innings_1\"]/div[1]/div[11]/div[2]");
		By total_run = By.xpath("//*[@id=\"innings_1\"]/div[1]/div[12]/div[2]");
		
		public int getTotalScore() {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.PAGE_DOWN);
			action.perform();
			WebElement total_run_web = driver.findElement(total_run);
			int total = Integer.parseInt(total_run_web.getText());
			return total;
		}
		
		public int getExtras() {
			WebElement extras_web = driver.findElement(extras);
			int extr = Integer.parseInt(extras_web.getText());
			return extr;
		}
}
