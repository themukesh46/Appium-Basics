package com.test.Appium_learn;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AppiumDriverLocalService service;
	public AndroidDriver driver;

	@BeforeClass
	public void config() throws MalformedURLException {
		// start appium
		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("/home/mukesh/.nvm/versions/node/v20.11.1/lib/node_modules/appium/build/lib/main.js"))

				.withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(60)).build();
		service.start();

		// config
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel5");
		options.setApp("/home/mukesh/eclipse-workspace/Appium-Basics/src/test/java/resources/ApiDemos-debug.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("************berore test ****************");

	} 
	
	public void longPressAction(WebElement element) {
		
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "duration",2000
			));
	}

	@AfterClass
	public void tearDown() {

		driver.quit();
		service.stop();

		System.out.println("**************after test**************");
	}

}
