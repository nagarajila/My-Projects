package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utilities.Screenshots;

public class Shopproductooo {

	WebDriver driver;

	public Shopproductooo(WebDriver driver )
	{
		this.driver =driver;
		
	}
	@FindBy(xpath="//a[@href='/en-us/shop']") WebElement shoppro;
//	@FindBy(xpath="//div[@class='w-3/4 py-1p px-2p']") WebElement content;
		public void shopproductoo() throws InterruptedException
	 {
			//Instantiating Actions class
			Actions actions = new Actions(driver);
			//To mouseover on sub menu
			actions.moveToElement(shoppro);
			actions.click().build().perform();
			Thread.sleep(10000);
//			driver.navigate().back();

		 

			
			
			Screenshots.captureScreenshots(driver);
			 
		 


	 }
}
