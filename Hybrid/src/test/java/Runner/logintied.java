package Runner;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageobjects.CouponsRewards;
import pageobjects.Facebookconnection;
import pageobjects.Learnmore;
import pageobjects.Loginpage;
import pageobjects.Searchapp;
import pageobjects.Shopproductooo;
import pageobjects.contact;
import pageobjects.livechat;
import pageobjects.privacypage;
import pageobjects.shoptext;

public class logintied extends Baseclass {

	@Test(priority = 1)
	public void loginApp() throws InterruptedException

	{
		log.info("Testcase-1 execution start");
		logger = report.createTest("login app");
		Loginpage lop1 = PageFactory.initElements(driver, Loginpage.class);
		logger.info("stating Apllication");
		lop1.LoginToTied();
		log.info("Successfully Login");
		logger.pass("login page");
		log.info("Testcase-1 is successfully executed");
	}
	
	@Test(priority = 2)
	public void livechatoo() throws InterruptedException

	{
		log.info("Testcase-2 execution start");
		Reporter.log("live Done", true);

		logger = report.createTest("livechat");

		livechat lopi4 = PageFactory.initElements(driver, livechat.class);
		lopi4.searcho();
		log.info("Successfully done of livechat");
		logger.pass("livechat done");
		log.info("Testcase-2 is successfully executed");

	}

	@Test(priority = 3)
	public void contactus() throws InterruptedException

	{
		log.info("Testcase-3 execution start");
		logger = report.createTest("contactpage");
		contact lop2 = PageFactory.initElements(driver, contact.class);
		lop2.contacttotied();
		log.info("click on contact page");
		logger.pass("contactus done");
		log.info("Testcase-3 is successfully executed");

	}

	

	@Test(priority = 4)
	public void searchapp() throws InterruptedException

	{
		log.info("Testcase-4 execution start");
		logger = report.createTest("Searchapp");
		Searchapp lopi8 = PageFactory.initElements(driver, Searchapp.class);

		Thread.sleep(4000);
		lopi8.searchapppp();

		log.info("Successfully searching for liquid");
		logger.pass("searching for liquid");
		log.info("Testcase-4 is successfully executed");

	}

	@Test(priority = 5)
	public void products() throws InterruptedException

	{
		log.info("Testcase-5 execution start");
		logger = report.createTest("Tiedapp");
		Shopproductooo lopi9 = PageFactory.initElements(driver, Shopproductooo.class);
		lopi9.shopproductoo();
		log.info("Successfully Tied app");
		logger.pass("Tied app done");
		log.info("Testcase-5 is successfully executed");

	}

	@Test(priority = 6)
	public void couponsandrewards() throws InterruptedException

	{
		log.info("Testcase-6 execution start");
		Reporter.log("coupons Done", true);
		logger = report.createTest("couponsandrewards");
		CouponsRewards lopi7 = PageFactory.initElements(driver, CouponsRewards.class);
		logger.info("coupons");
		lopi7.couponsrewards();


		log.info("Successfully verified ");
		logger.pass("coupons done");
		log.info("Testcase-6 is successfully executed");

	}

	@Test(priority = 7)
	public void Learnmoreee() throws InterruptedException

	{
		log.info("Testcase-7 execution start");
		Reporter.log("Learnmore done", true);
		logger = report.createTest("Learnmore");
		Learnmore lopi6 = PageFactory.initElements(driver, Learnmore.class);
		Thread.sleep(10000);

		lopi6.Learnmoree();

		log.info("Successfully click on learnmore");
		logger.pass("Learnmore done");
		log.info("Testcase-7 is successfully executed");

	}

	@Test(priority = 8)
	public void Facebookkkk() throws InterruptedException

	{
		log.info("Testcase-8 execution start");
		Reporter.log("searching Done", true);

		logger = report.createTest("facebook");

		Facebookconnection lopi5 = PageFactory.initElements(driver, Facebookconnection.class);
		logger.info("searching for facebook");
		lopi5.facebook();
		log.info("Facebook done");
		logger.pass("searching of facebook ");
		log.info("Testcase-8 is successfully executed");

	}

	@Test(priority = 9)
	public void shoptext() throws InterruptedException

	{
		log.info("Testcase-9 execution start");
		logger = report.createTest("shoptext");
		shoptext lopia = PageFactory.initElements(driver, shoptext.class);
		lopia.aboutu();
		log.info("Successfully get text ");
		logger.pass("done with shoptext");
		log.info("Testcase-9 is successfully executed");

	}

	@Test(priority = 10)
	public void privacy() throws InterruptedException

	{
		log.info("Testcase-10 execution start");
		logger = report.createTest("privacy");

		privacypage lopioo = PageFactory.initElements(driver, privacypage.class);
		logger.info("getall the text");
		lopioo.privacyyyy();
		log.info("Successfully Infoapp");
		logger.pass("done and back to eclipse");
		log.info("Testcase-10 is successfully executed");

	}

}
