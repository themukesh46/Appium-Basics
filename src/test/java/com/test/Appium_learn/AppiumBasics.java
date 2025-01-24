package com.test.Appium_learn;

import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasics extends BaseTest {

	@Test
	public void wifiSettingsName() {

		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
	String settings=	driver.findElement(By.id("android:id/alertTitle")).getText();
	
	
	Assert.assertEquals(settings, "WiFi settings");
	
		driver.findElement(By.id("android:id/edit")).sendKeys("test");
		driver.findElement(By.id("android:id/button1")).click();
	}

}
