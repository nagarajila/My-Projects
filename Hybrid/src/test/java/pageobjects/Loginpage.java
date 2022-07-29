package pageobjects;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

import Utilities.Screenshots;

public class Loginpage {

WebDriver driver;
	
	public Loginpage(WebDriver driver )
	{
		this.driver =driver;
	}
	
	
public void LoginToTied() throws InterruptedException 
{
		
	Thread.sleep(2000);
	Screenshots.captureScreenshots(driver);

	}
}
