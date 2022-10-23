package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class d_runoutplayer {
	WebDriver driver;
	By runoutPl = By.xpath("//a[@title='View profile of Nuwan Kulasekara']");
	
	public d_runoutplayer(WebDriver driver) {
		this.driver = driver;
	}
	
	public void runoutPlayer() {
		WebElement runout_player = driver.findElement(runoutPl);
		System.out.println("Runout player name: "+runout_player.getText());
	}
	
	
//	WebElement runout_player = driver.findElement(By.xpath("//a[@title='View profile of Nuwan Kulasekara']"));
//	System.out.println("Runout player name: "+runout_player.getText());

}
