package com.appium.test;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


//import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestBMT {

	AndroidDriver driver;
		
	@Test
	public void testbmtApp() throws MalformedURLException
	
	{
		DesiredCapabilities capability = new DesiredCapabilities();
		
		capability.setCapability("deviceName", "Moto G");
		//capability.setCapability("deviceName", "Nexus5 Simulator");
		
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformVersion", "6.0");
		
		capability.setCapability("appPackage", "com.opteamix.bookmytime");
		// This package name of your app (you can get it from apk info app)
		capability.setCapability("appActivity","com.opteamix.bookmytime.base.BMTAuthActivity");
		
		File file = new File ("C:\\Users\\srana\\Downloads\\BMT_ANDROID-1.0_04-MAR-2016.apk");
		capability.setCapability("app",file.getAbsolutePath());
		
	  driver = new AndroidDriver(new URL ("http://172.18.0.47:4723/wd/hub"),capability);
		//driver = new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"),capability);
		//driver.quit();
		
		
	}
	
	
	@Test
	public void testRegisteration() throws Exception{
		

    driver.findElement(By.id("com.google.android.googlequicksearchbox:id/icon")).click();
    driver.wait(5000);
    
    driver.findElement(By.name("Register")).click();
		
	driver.wait(5000);
		
		
	}
	
	
	
	@Test
	/*public void testCal() throws Exception {
	   //locate the Text on the calculator by using By.name()
	   WebElement two=driver.findElement(By.name("2"));
	   two.click();
	   WebElement plus=driver.findElement(By.name("+"));
	   plus.click();
	   WebElement four=driver.findElement(By.name("4"));
	   four.click();
	   WebElement equalTo=driver.findElement(By.name("="));
	   equalTo.click();
	   //locate the edit box of the calculator by using By.tagName()
	   WebElement results=driver.findElement(By.tagName("EditText"));
		//Check the calculated value on the edit box
	assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";

	}*/

	@AfterClass
	public void teardown(){
		//close the app
		driver.quit();
	}
	
	}
	

/*comment*/