package com.AOL.testcases;

import org.testng.annotations.Test;

import com.AOL.framework.ConfigureBrowser;
import com.AOL.pages.AolAutospage;
import com.AOL.pages.HomePage;
import com.AOL.pages.SearchResultsPage;


public class AolTest extends ConfigureBrowser{
	
	/**
	 * This testcase verifies Entertainment,Sports,News links/elements present on the homepage .
	 */
	
@Test(description="verifying the news,entertainment,sports links present on home page", priority = 1)
public void verifyinglinks(){
	HomePage homePage = new HomePage(getWebDriver());
	homePage.assertPageWithUrl("Verify we are on home page");
	homePage.isPresent(HomePage.entertainmentLink, "Verify Entertainment link is present");
	homePage.isPresent(HomePage.newsLink,"verify News link is present");
	homePage.isPresent(HomePage.sportsLink, "verify sports link is present");
}

/**
 * this testcase search for Aol autos and verifies the Web,Mail links /elements present on the page and verifying the logo
 */

@Test(description="Search for Aol Autos", priority = 2)
public void searchAolAutos(){
	HomePage homePage = new HomePage(getWebDriver());
	homePage.sendKeys(HomePage.searchBox, "aol autos", "searching for aol autos");
	homePage.click(HomePage.searchButton, "click the search button");
	SearchResultsPage searchResultsPage = new SearchResultsPage(getWebDriver());
	searchResultsPage.assertPageWithPageTitle("Verify we are search results page");
	searchResultsPage.isPresent(SearchResultsPage.webLink, "Verify web link is present");
	searchResultsPage.isPresent(SearchResultsPage.mailLink, "Verify mail link is present");
	searchResultsPage.click(SearchResultsPage.sitemapUrl, "Click AolAutos link");
	
	//Verifying Aol autos logo
	
	AolAutospage aolAutoPage = new AolAutospage(getWebDriver());
	aolAutoPage.isPresent(AolAutospage.aolAutoLogo, "Verify logo is present");
	aolAutoPage.click(AolAutospage.aolAutoLogo, "click the aol autos logo");
	System.out.println("logo is verified");

}
	

}
