package com.AOL.framework;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasicActions {
	
	static Logger log =  Logger.getLogger(BasicActions.class);
	
	public WebDriver driver;
	
	public BasicActions(WebDriver driver){
		this.driver = driver;
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	/**
	 * to get the log message
	 * @param logs
	 */
	public void logMessage(String logs){
		PropertyConfigurator.configure("log4j.properties");
		Reporter.log(""+logs+"<br>");
		log.info(logs);
	}
	
	/**
	 * clicking the element 
	 * @param locator
	 * @param description
	 */
	
	public void click(By locator, String description){
		logMessage(description);
		WebElement element = driver.findElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, 16);
	    wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	/**
	 * This method verifies the element is present on the page.
	 * @param locator
	 * @param description
	 */
	
	public void isPresent(By locator, String description){
		logMessage(description);
		WebElement element = driver.findElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, 16);
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	    element.isDisplayed();
	    
	}

	/**
	 * Enter given value in the located text field
	 * @param locator
	 * @param value
	 * @param description
	 */
	
	public void sendKeys(By locator, String value, String description){
		logMessage(description);
		WebElement textField = driver.findElement(locator);
		textField.clear();
		textField.sendKeys(value);
	}
	
	
	/**
	 * verifying the expected and actual url
	 * @param description
	 */
	
	public void assertPageWithUrl(String description){
		logMessage(description);
		String actualUrl = driver.getCurrentUrl();
		if(getPagePath().equalsIgnoreCase(actualUrl)){
			Assert.assertTrue(true);
		} else {
			logMessage("Actual : " + actualUrl +" <br> but Expected page is " + getPagePath() +"<br>");
			Assert.assertTrue(false);
	}
}
	
	/**
	 * 
	 * @param description
	 */
	public void assertPageWithPageTitle(String description){
		logMessage(description);
		String actualPageTitle = driver.getTitle();
		if(getPageTitle().equals(actualPageTitle)){
			Assert.assertTrue(true);
		} else {
			logMessage("Actual : " + actualPageTitle +" <br> but Expected page is " + getPageTitle() +"<br>");
			Assert.assertTrue(false);
		}
	}
			
	
	/**
	 * To find the current page path
	 * @return 
	 */
	public abstract String getPagePath();

	/**
	 * To find the current page path
	 * @return 
	 */
 
 	public abstract String getPageTitle();

}
