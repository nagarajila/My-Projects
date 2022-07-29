package pageobects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.screenshots;

public class contact {

	WebDriver driver;
	public contact(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="(//a[@href='/en-us/contact-us'])[1]") WebElement sp ;
	

 
	
	public void contacttotied() throws InterruptedException, IOException
	{
	
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		
		ex.executeScript("arguments[0].click()", sp);
		Thread.sleep(3000);
		screenshots.getScreenshot(driver, "user");

		driver.navigate().back();
		
		
		
		
				
			}
}
