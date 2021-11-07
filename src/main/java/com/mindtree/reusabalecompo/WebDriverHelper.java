package com.mindtree.reusabalecompo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.externalconfig.ConfigLoader;
import com.mindtree.utility.ConfigDataProvider;
//import com.mindtree.utilities.ConfigDataProvider;

public class WebDriverHelper {
	

	public WebDriver driver;
	public Properties pro;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;

	public WebDriver initializedriver() throws IOException
	{
		config = new ConfigDataProvider();
		String browsername = config.getbrowser();
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SDET_Java\\FinalHybridFrameowrk\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
	
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	

}
