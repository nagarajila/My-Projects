package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Screenshots;

public class Searchapp {

WebDriver driver;
	
	public Searchapp(WebDriver driver )
	{
		this.driver =driver;
		
	}
		@FindBy(xpath="//input[@name='q']") WebElement search;
		
	
      public void searchapppp() throws InterruptedException
    {
    	  search.sendKeys("liquid");
    	  Thread.sleep(5000);
    	  search.sendKeys(Keys.ENTER);
    	  

    	  Screenshots.captureScreenshots(driver);   	  
    	//  driver.navigate().back();
    }
}
