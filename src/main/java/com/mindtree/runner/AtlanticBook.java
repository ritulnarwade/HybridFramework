package com.mindtree.runner;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.pageobject.LandingPage;
import com.mindtree.pageobject.SearchBook;
import com.mindtree.reusabalecompo.WebDriverHelper;
import com.mindtree.utility.Takess;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class AtlanticBook extends WebDriverHelper {
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializedriver();
	//	log.info("Driver is initialized");
		driver.get(config.geturl());
		
	}
	
	@Test(priority=1)
	public void landingpagenavigation() throws IOException
	{
		
	
	//	logger = report.createTest("searching book");
		LandingPage l = new LandingPage(driver);
		l.searchbook().sendKeys("gmat");
		l.searchbook().sendKeys(Keys.ENTER);
		Takess.ss(driver);
	
		
	}
	
	@Test(priority=2)
	public void searchpagenav()
	{
		SearchBook sb = new SearchBook(driver);
		sb.book().click();
		sb.clickaddtocart().click();
	}
	
	@AfterTest
	public void teatdown()
	{
		driver.close();
	}

}
