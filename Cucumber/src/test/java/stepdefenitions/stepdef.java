package stepdefenitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobects.CouponsRewards;
import pageobects.Facebookconnection;
import pageobects.Learnmore;
import pageobects.Searchapp;
import pageobects.Shopproductooo;
import pageobects.contact;
import pageobects.livechat;
import pageobects.privacypage;
import pageobects.shoptext;
import utilities.readproperties;
import utilities.screenshots;


public class stepdef {
	readproperties prop = new readproperties();
	WebDriver Driver;

	@Given("user launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagaraj\\saleniumProject\\CucumberComprehensive\\drivers\\chromedriver.exe");

	}

	@When("user opens url {string}")
	public void user_opens_url(String string) throws IOException {
		Driver = new ChromeDriver();
		Driver.get("https://tide.com/en-us");
		screenshots.getScreenshot(Driver, "user");

	}

	@Then("close the browser")
	public void close_the_browser() {
		Driver.quit();

	}
	@Then("user click on contactus button")
	public void user_click_on_contactus_button() throws InterruptedException, IOException {
		contact lopi = PageFactory.initElements(Driver, contact.class);
		lopi.contacttotied();
		screenshots.getScreenshot(Driver, "contact");
		
	   
	}
	@Then("user click on Livechat button")
	public void user_click_on_livechat_button() throws InterruptedException, IOException {
		livechat lop1 = PageFactory.initElements(Driver, livechat.class);
		lop1.searcho();
		screenshots.getScreenshot(Driver, "Livechat");
	    
	}
	@When("user click on search button")
	public void user_click_on_search_button() throws InterruptedException, IOException {
		Searchapp lop2 = PageFactory.initElements(Driver, Searchapp.class);
		lop2.searchapppp();
		screenshots.getScreenshot(Driver, "search");
	}
	@Then("user click on shopproduct button")
	public void user_click_on_shopproduct_button() throws InterruptedException, IOException {
		Shopproductooo lop3 = PageFactory.initElements(Driver, Shopproductooo.class);
		lop3.shopproductoo();
		screenshots.getScreenshot(Driver, "shoproduct");
	   
	}
	@When("user click on couponsandrewards button")
	public void user_click_on_couponsandrewards_button() throws InterruptedException, IOException {
		CouponsRewards lop4 = PageFactory.initElements(Driver, CouponsRewards.class);
		lop4.couponsrewards();
		screenshots.getScreenshot(Driver, "couponsandrewards");
	   
	}
	@Then("user click on  learnmore  button")
	public void user_click_on_learnmore_button() throws InterruptedException, IOException {
		Learnmore lop5 = PageFactory.initElements(Driver, Learnmore.class);
		lop5.Learnmoree();
		screenshots.getScreenshot(Driver, "learnmore");
	}
	@Then("user click on  facebook  button")
	public void user_click_on_facebook_button() throws InterruptedException, IOException {
		Facebookconnection lop6 = PageFactory.initElements(Driver, Facebookconnection.class);
		lop6.facebook();
		screenshots.getScreenshot(Driver, "facebook");
	}
	@Then("user click on shoptext button")
	public void user_click_on_shoptext_button() throws InterruptedException, IOException {
		shoptext lop7 = PageFactory.initElements(Driver, shoptext.class);
		lop7.aboutu();
		screenshots.getScreenshot(Driver, "shoptext");
	}
	@Then("user click on  privacy  button")
	public void user_click_on_privacy_button() throws InterruptedException, IOException {
		privacypage lop8 = PageFactory.initElements(Driver, privacypage.class);
		lop8.privacyyyy();
		screenshots.getScreenshot(Driver, "privacy");
	}







}
