package com.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.driver.Driver;
import com.utilities.ReadPropertiesFile;

import io.appium.java_client.android.AndroidElement;

public class League_Pages extends Driver {

	public static final String filename = null;
	public ReadPropertiesFile readPropertiesFile = new ReadPropertiesFile();
	public Properties prop = readPropertiesFile.readPropertiesFile(filename);

	public League_Pages() {
		PageFactory.initElements(driver, this);
	}

	public void navtoLeagueSection() {
		AndroidElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='NFL']"));
		element.click();
	}

	public String getNFLText() {
		AndroidElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='NFL']"));
		return element.getText();
	}

	public String verifySelected_League() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AndroidElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='NFL Football']"));
		return element.getText();
	}

	public void navTo_Standing_Tab() {
		AndroidElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='STANDINGS']"));
		element.click();
	}

	public String verifySelected_SubTab() {
		AndroidElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='AFC']"));
		return element.getText();
	}

	public void back_button_arrow() {
		AndroidElement element = driver.findElement(By.className("android.widget.ImageButton"));
		element.click();
	}
}