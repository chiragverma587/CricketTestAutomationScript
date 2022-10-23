package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class c_totalboundaries {
	
	WebDriver driver;
	
	public c_totalboundaries(WebDriver driver) {
		this.driver = driver;
	}
	
	public void totalBoundaries() {
		try {
			int tot_bndry=0;
			for(int i=3;i<=10;i++) {
				for(int j=5;j<=6;j++) {
					WebElement b = driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div["+i+"]/div["+j+"]"));
					tot_bndry = tot_bndry + Integer.parseInt(b.getText());
				}
			}
			System.out.println("Total boundaries: "+tot_bndry);
		}catch (Exception e) {
			System.out.println("Exceptions caught "+e.getMessage());
		}
		
	}

}
