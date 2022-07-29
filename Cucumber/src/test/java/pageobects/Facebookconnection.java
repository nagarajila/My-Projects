package pageobects;


import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.screenshots;

public class Facebookconnection {
	WebDriver driver;
	public Facebookconnection(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//a[@href='https://www.facebook.com/Tide?fref=ts']") WebElement facebook;


	
	
	public void facebook() throws InterruptedException,IOException
	{
		
	
		JavascriptExecutor ex = (JavascriptExecutor) driver;

		ex.executeScript("arguments[0].scrollIntoView()", facebook);
		Thread.sleep(2000);
		ex.executeScript("arguments[0].click();", facebook);
		Thread.sleep(1000);

		driver.navigate().back();

		screenshots.getScreenshot(driver, "user");
		
				}
}
