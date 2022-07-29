package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contact {

	WebDriver driver;
	public contact(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="(//a[@href='/en-us/contact-us'])[1]") WebElement sp ;
	
	
 
	
	public void contacttotied() throws InterruptedException
	{
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		
		ex.executeScript("arguments[0].click()", sp);
		Thread.sleep(10000);

		driver.navigate().back();
		
		
		
		
				
			}
}
