package com.AOL.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.AOL.framework.BasicActions;

public class SearchResultsPage  extends BasicActions{
	
public static final String PAGE_TITLE = "AOL - News, Sports, Weather, Entertainment, Local & Lifestyle";

/**
 * These are the web elements present  on aol autos search results page.
 */

public final static By webLink = By.xpath(".//div[@class='tab atab ftab'][contains(text(),'Web')]");
public final static By mailLink = By.id("mail");
public final static By sitemapUrl = By.cssSelector("a[class^='find'][href$='http://autos.aol.com/sitemap/']");

	public SearchResultsPage(WebDriver driver) {
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
