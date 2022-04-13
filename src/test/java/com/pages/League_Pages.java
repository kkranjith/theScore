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

public class League_Pages extends Driver {

	public static final String filename = null;
	public ReadPropertiesFile readPropertiesFile = new ReadPropertiesFile();
	public Properties prop = readPropertiesFile.readPropertiesFile(filename);
	
	@FindBy(xpath = "//android.widget.TextView[@text='NFL']")
	AndroidElement NFL;

	@FindBy(xpath = "//android.widget.TextView[@text='NFL Football']")
	AndroidElement selected_League;

	@FindBy(xpath = "//android.widget.TextView[@text='STANDINGS']")
	AndroidElement standings;

	@FindBy(xpath = "//android.widget.TextView[@text='AFC']")
	AndroidElement AFC;
	
	@FindBy(className = "android.widget.ImageButton")
	AndroidElement back_button;

	public League_Pages(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void navtoLeagueSection() {
		NFL.click();
	}

	public String getNFLText() {
		return NFL.getText();
	}

	public String verifySelected_League() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return selected_League.getText();
	}

	public void navTo_Standing_Tab() {
		standings.click();
	}

	public String verifySelected_SubTab() {
		return AFC.getText();
	}

	public void back_button_arrow() {
		back_button.click();
	}
}
