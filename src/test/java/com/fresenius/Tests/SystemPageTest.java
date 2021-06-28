package com.fresenius.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fresenius.Pages.SystemPage;

public class SystemPageTest extends TestBase{
	
	WebDriver driver;
	public SystemPage sp = null;

	@BeforeMethod
	public void setUp() throws IOException {

		driver = super.launchApplication();
		sp = loadLoginPage().navigateToSystemPage(driver);
	}

	/*
	 * @AfterMethod public void tearDown() { driver.close(); }
	 */

	@Test
	public void verifyTitle() {
		sp.links();
	}

}
