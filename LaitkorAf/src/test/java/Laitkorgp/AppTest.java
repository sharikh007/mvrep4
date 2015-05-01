package Laitkorgp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	@Test
	public void samtest(){
		WebDriver dri=new FirefoxDriver();
		dri.get("http://www.yahoo.com");
		}

}
