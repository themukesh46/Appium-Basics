package com.test.Appium_learn;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends BaseTest {

	@Test
	public void wifiSettingsName() throws MalformedURLException, InterruptedException {
		Thread.sleep(6000);	
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		
		
		
		
		

	}

}
