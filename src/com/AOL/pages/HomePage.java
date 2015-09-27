package com.AOL.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.AOL.framework.BasicActions;

public class HomePage extends BasicActions {
	
	public final static String PAGE_PATH = "http://www.aol.com/";
	
	/**
	 * These are the elements present on homepage
	 */
	
	public static final By newsLink = By.id("ghnav-news");
	public static final By sportsLink = By.id("ghnav-sports");
	public static final By entertainmentLink = By.id("ghnav-entertainment");
	public static final By searchBox = By.id("aol-header-query");
	public static final By searchButton = By.id("aol-header-search-button");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getPagePath() {
		return PAGE_PATH;
		
	}

	@Override
	public String getPageTitle() {
		return null;
	}


		
	}


