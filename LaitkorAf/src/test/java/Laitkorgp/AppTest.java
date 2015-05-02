package Laitkorgp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppTest {
	WebDriver dri;
	@BeforeTest
	@Parameters("browser")
	public void bef(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			dri=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.getProperty("webdriver.chrome.driver","/path/to/chromedriver");
			dri=new ChromeDriver();
		}
		}
 @Test(testName="testone", priority=1)
	public void paralleltetsone() {
	dri.get("http://www.yahoo.com");
		}
 @Test(testName="testtwo",priority=2)
	public void paralleltesttwo() {
	dri.get("http://www.google.com");
		}
 
 @AfterTest
 public void closebrow(){
	 dri.close();
	 
 }
}