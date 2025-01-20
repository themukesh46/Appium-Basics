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

public class AppiumBasics {

	@Test
	public void appiumBasics() throws MalformedURLException {

		// start appium
		AppiumDriverLocalService service = new AppiumServiceBuilder()
				.withAppiumJS(new File("/home/mukesh/.nvm/versions/node/v20.11.1/lib/node_modules/appium/build/lib"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		//config 
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel5");
		options.setApp("/home/mukesh/eclipse-workspace/Appium-learn/src/test/java/resources/ApiDemos-debug.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

		driver.quit();
		service.stop();

	}

}
