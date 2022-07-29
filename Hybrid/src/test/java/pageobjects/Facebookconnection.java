package pageobjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Screenshots;

public class Facebookconnection {
	WebDriver driver;
	public Facebookconnection(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//a[@href='https://www.facebook.com/Tide?fref=ts']") WebElement facebook;
	 

	
	
	public void facebook() throws InterruptedException 
	{
		
		
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		

		ex.executeScript("arguments[0].scrollIntoView()", facebook);
		ex.executeScript("arguments[0].click()", facebook);
		Thread.sleep(1000);
		Screenshots.captureScreenshots(driver);
		driver.navigate().back();
		
      
//	    Thread.sleep(5000);
			
		
				}
}
