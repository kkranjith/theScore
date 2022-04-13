package com.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.driver.Driver;
import com.utilities.ReadPropertiesFile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Score_pages extends Driver {
	public static final String filename = null;
	public ReadPropertiesFile readPropertiesFile = new ReadPropertiesFile();
	public Properties prop = readPropertiesFile.readPropertiesFile(filename);

	@FindBy(xpath = "//android.widget.TextView[@text='Get Started']")
	AndroidElement get_Started;

	@FindBy(xpath = "//android.widget.TextView[@text='NFL Football']")
	AndroidElement NFL_FootBall;

	@FindBy(xpath = "//android.widget.TextView[@text='PGA Tour']")
	AndroidElement PGA;

	@FindBy(xpath = "//android.widget.TextView[@text='Continue']")
	AndroidElement continue_Button;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Maybe Later']")
	AndroidElement mayBeLater_button;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Manchester United']")
	AndroidElement man_Utd;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Golden State Warriors']")
	AndroidElement golden_State_Warriors;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Done']")
	AndroidElement done_button;
	
	public Score_pages(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void getStarted_Click() {
		get_Started.click();
	}

	public void waitForApptoLoad() {
		Score_pages.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void sportSelection() {
		NFL_FootBall.click();
		PGA.click();
	}

	public void continue_Button() {
		continue_Button.click();
	}

	public void mayBeLater_button() {
		mayBeLater_button.click();
	}

	public void favTeamSelection() {
		man_Utd.click();
		golden_State_Warriors.click();
	}

	public void Done_button() {
		done_button.click();
	}
}
