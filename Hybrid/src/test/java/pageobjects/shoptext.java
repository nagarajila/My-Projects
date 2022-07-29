package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shoptext {
	WebDriver driver;

	public shoptext(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id='site-footer']/div[2]/div/div[1]/div/div[1]/h5")
	WebElement getex;

	public void aboutu() throws InterruptedException {
		System.out.println("this is text ");
		System.out.println(getex.getLocation());
		System.out.println(getex.getText());
//		Helperclass.captureScreenshots(driver);
		Thread.sleep(3000);

		

	}
}
