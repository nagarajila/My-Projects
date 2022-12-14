package browserfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver,String browserName,String appurl)
	{
		if(browserName.equalsIgnoreCase("chrome"))
	    {
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagaraj\\saleniumProject\\HybridFrameworkComprehensive\\driver\\chromedriver.exe");

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		
		else if(browserName.equals("Firefox")) 
		
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			

			
		}
		else
		{
			System.out.println("Browser not support");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(appurl);
		return driver;
			
		
		
	}
	
	public static void quitBrowser(WebDriver driver) 
	{
		driver.quit();
	}
	
}
