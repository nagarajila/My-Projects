package pageobects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.screenshots;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

public class Loginpage {

	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		
	}
	@FindBy(xpath = "//*[@id='lilo3746-wrapper']/div/a")
	WebElement popup;

	public void LoginToTied() throws InterruptedException, IOException {
		
		popup.click();
		Thread.sleep(2000);
		screenshots.getScreenshot(driver, "Homepage");
		driver.navigate().back();
	}
}
