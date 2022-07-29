package pageobjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class livechat {

WebDriver driver;
	
	public livechat(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath= "//a[@href='/en-us/live-chat']")WebElement livechat;
	@FindBy(xpath= "//*[@id='site-content']/div/div/div/div/div[6]/button/span")WebElement back_up;


	public void searcho( ) throws InterruptedException
	{
		
	
		 		
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		
		ex.executeScript("arguments[0].click()", livechat);
		Thread.sleep(10000);
		ex.executeScript("arguments[0].scrollIntoView()", back_up);
		ex.executeScript("arguments[0].click()", back_up);
		Thread.sleep(2000);

		driver.navigate().back();
		
		
	}
}
