package pageobects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.screenshots;

public class Shopproductooo {

	WebDriver driver;

	public Shopproductooo(WebDriver driver )
	{
		this.driver =driver;
		
	}
	@FindBy(xpath="//a[@href='/en-us/shop']") WebElement shoppro;

		public void shopproductoo() throws InterruptedException, IOException
	 {
			
			//Instantiating Actions class
			Actions actions = new Actions(driver);
			//To mouseover on sub menu
			actions.moveToElement(shoppro);
			actions.click().build().perform();
			Thread.sleep(10000);
//			driver.navigate().back();

			
			screenshots.getScreenshot(driver, "user");
			 
		 


	 }
}
