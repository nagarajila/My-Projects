package pageobects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.screenshots;

public class CouponsRewards {
	WebDriver driver;

	public CouponsRewards(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id='site-header']/div[3]/div/div/div/div[5]/a")
	WebElement CandR;

	
	public void couponsrewards() throws InterruptedException, IOException

	{
		
		CandR.click();
		Thread.sleep(5000);
//		driver.navigate().back();

		screenshots.getScreenshot(driver, "user");

	}
}
