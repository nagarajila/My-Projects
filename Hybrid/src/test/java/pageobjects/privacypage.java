package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utilities.Screenshots;

public class privacypage {

	WebDriver driver;
	public privacypage(WebDriver driver )
	{
		this.driver =driver;
	}
	
	@FindBy(xpath="//a[@href='https://privacypolicy.pg.com/en/']") WebElement Privacy;
//	@FindBy(xpath="//a[@href='/static/PDF/en.pdf']") WebElement pdf;


	public void privacyyyy() throws InterruptedException
	{
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		
		ex.executeScript("arguments[0].scrollIntoView()", Privacy);
		Thread.sleep(2000);
		ex.executeScript("arguments[0].click();", Privacy);
		Thread.sleep(1000);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(pdf);
//		actions.click().build().perform();
//		Thread.sleep(5000);
		
		
		Screenshots.captureScreenshots(driver);

		
	}
}
