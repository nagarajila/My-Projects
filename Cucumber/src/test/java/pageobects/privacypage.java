package pageobects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.screenshots;

public class privacypage {

	WebDriver driver;

	public privacypage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//a[@href='https://privacypolicy.pg.com/en/']")
	WebElement Privacy;

	public void privacyyyy() throws InterruptedException, IOException {
		
		
		JavascriptExecutor ex = (JavascriptExecutor) driver;

		ex.executeScript("arguments[0].scrollIntoView()", Privacy);
		Thread.sleep(2000);
		ex.executeScript("arguments[0].click();", Privacy);
		Thread.sleep(1000);

		driver.navigate().back();

		screenshots.getScreenshot(driver, "user");

	}
}
