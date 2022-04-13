package com.tests;

import java.net.MalformedURLException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.driver.Driver;
import com.pages.League_Pages;
import com.pages.Score_pages;
import com.utilities.ReadPropertiesFile;

public class TheScoreTest extends Driver {
	public static final String fileName = null;
	public ReadPropertiesFile readfile = new ReadPropertiesFile();
	public Properties prop = readfile.readPropertiesFile(fileName);
	Score_pages score_pages;
	League_Pages league_pages;

	@BeforeMethod
	public void initialization() throws MalformedURLException {
		Driver.core_Capabilities();
	}

	@Test(priority = 0)
	public void getStarted_NavigatingToLeagues() {
		score_pages = new Score_pages(driver);
		league_pages = new League_Pages(driver);
		score_pages.waitForApptoLoad();
		score_pages.getStarted_Click();
		score_pages.sportSelection();
		score_pages.continue_Button();
		score_pages.mayBeLater_button();
		score_pages.favTeamSelection();
		score_pages.continue_Button();
		score_pages.Done_button();
		Assert.assertEquals(league_pages.getNFLText(), "NFL");
		league_pages.navtoLeagueSection();
		league_pages.navTo_Standing_Tab();
		Assert.assertEquals(league_pages.verifySelected_SubTab(), "AFC");
		league_pages.back_button_arrow();
		Assert.assertEquals(league_pages.getNFLText(), "NFL");
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
