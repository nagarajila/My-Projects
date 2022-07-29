package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Screenshots;

public class Learnmore {

	WebDriver driver;
	public Learnmore(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="(//a[@href='/en-us/our-commitment/a-load-of-good'])[1]")
	WebElement Learnmore;
	
	
	public void Learnmoree() throws InterruptedException
	{
		
		 JavascriptExecutor ex = (JavascriptExecutor)driver;

		ex.executeScript("arguments[0].scrollIntoView()", Learnmore);
		Thread.sleep(2000);
		ex.executeScript("arguments[0].click();",Learnmore);
		Thread.sleep(3000);
		driver.navigate().back();


						
		
		Screenshots.captureScreenshots(driver);
		
		
		
			}
}
