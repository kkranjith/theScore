package com.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.driver.Driver;
import com.utilities.ReadPropertiesFile;

import io.appium.java_client.android.AndroidElement;

public class Score_pages extends Driver {
	public static final String filename = null;
	public ReadPropertiesFile readPropertiesFile = new ReadPropertiesFile();
	public Properties prop = readPropertiesFile.readPropertiesFile(filename);

	public Score_pages() {
		PageFactory.initElements(driver, this);
	}

	public void getStarted_Click() {
		AndroidElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Get Started']"));
		element.click();
	}

	public void waitForApptoLoad() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void sportSelection() {
		AndroidElement element1 = driver.findElement(By.xpath("//android.widget.TextView[@text='NFL Football']"));
		element1.click();
		AndroidElement element2 = driver.findElement(By.xpath("//android.widget.TextView[@text='PGA Tour']"));
		element2.click();
	}

	public void continue_Button() {
		AndroidElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']"));
		element.click();
	}

	public void mayBeLater_button() {
		AndroidElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Maybe Later']"));
		element.click();
	}

	public void favTeamSelection() {
		AndroidElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Manchester United']"));
		element.click();
		AndroidElement element1 = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Golden State Warriors']"));
		element1.click();
	}

	public void Done_button() {
		AndroidElement element = driver.findElement(By.xpath(" //android.widget.TextView[@text='Done']"));
		element.click();
	}
}