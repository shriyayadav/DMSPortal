package com.fresenius.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fresenius.Pages.LoginPage;

public class LoginPageTest extends TestBase {

	WebDriver driver;
	public LoginPage lp = null;

	@BeforeMethod
	public void setUp() throws IOException {

		driver = super.launchApplication();
		lp = loadLoginPage();

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void login() {
		Assert.assertTrue(lp.login());
	}

}
