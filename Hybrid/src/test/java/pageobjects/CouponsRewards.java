package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Screenshots;

public class CouponsRewards {
	WebDriver driver;

	public CouponsRewards(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id='site-header']/div[3]/div/div/div/div[5]/a")
	WebElement CandR;

	// a[@href='/en-us/coupons-and-rewards']
	public void couponsrewards() throws InterruptedException

	{
		CandR.click();
		Thread.sleep(5000);
//		driver.navigate().back();

		Screenshots.captureScreenshots(driver);

	}
}
