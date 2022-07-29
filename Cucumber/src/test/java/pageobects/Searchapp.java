package pageobects;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.screenshots;

public class Searchapp {

WebDriver driver;
	
	public Searchapp(WebDriver driver )
	{
		this.driver =driver;
		
	}
		@FindBy(xpath="//input[@name='q']") WebElement search;

      public void searchapppp() throws InterruptedException, IOException
    {
    	
    	  search.sendKeys("liquid");
    	  Thread.sleep(5000);
    	  search.sendKeys(Keys.ENTER);
//    	  driver.navigate().back();

    	  screenshots.getScreenshot(driver, "user");  	  
    	  
    }
}
