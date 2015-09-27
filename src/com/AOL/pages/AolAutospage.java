package com.AOL.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.AOL.framework.BasicActions;

public class AolAutospage extends BasicActions {
	
public static final String PAGE_TITLE = "Site Map - AOL Autos";

/**
 * This element is a logo present on http://autos.aol.com/ this page.
 */

public static final By aolAutoLogo = By.cssSelector("a[href='http://www.autoblog.com/']");

	public AolAutospage(WebDriver driver) {
		super(driver);
		
	}

	@Override
	public String getPagePath() {
		return null;
	}

	@Override
	public String getPageTitle() {
		return PAGE_TITLE;
	}
	

}
