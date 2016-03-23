package com.appium.test;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestBMT {

	AndroidDriver driver;
		
	@BeforeTest
	public void testbmtApp() throws MalformedURLException
	
	{
		DesiredCapabilities capability = new DesiredCapabilities();
		
		//capability.setCapability("deviceName", "Nexus5");
		capability.setCapability("deviceName", "ONE A2003");
		
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformVersion", "5.1.1");
		
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
		
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.id("com.google.android.googlequicksearchbox:id/icon")).click();
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
   //driver.findElement(By.id("com.opteamix.bookmytime:id/id_register")).click();
    driver.findElement(By.id("com.opteamix.bookmytime:id/id_signIn")).click();
	
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		
	}
	
	
	
	/*@Test
	public void testCal() throws Exception {
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