package com.AOL.framework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ConfigureBrowser {
	
	public static WebDriver driver;
	
	static Logger log =  Logger.getLogger(ConfigureBrowser.class);
	
	public WebDriver getWebDriver(){
		return driver;
	}
	
	@BeforeClass
	public void basicSetup(){
    final String url = "http://www.aol.com";
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAY\\Desktop\\webdrivers\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
   // driver = new FirefoxDriver();
    log.info("Launching browser with "+url+"");
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	/**
	 * This method close the current WebDriver
	 */
	public static void closeBrowser(){
		driver.close();
	}
	
	
		
}
