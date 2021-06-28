package com.fresenius.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.fresenius.ObjectRepository.LoginPageObjectRepository;

public class LoginPage extends LoginPageObjectRepository {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean login() {
		advanced_btn.click();
		link.click();
		username.sendKeys("kabi\\shriyay");
		password.sendKeys("Nephro@7896");
		submitbtn.click();
		
		String actual_Title = title_text.getText();
		String expected_Title = "GLOBALPROTECT";

		if (actual_Title.equals(expected_Title)) {
			System.out.println("actual  " + actual_Title);
			return true;
		} else
			System.out.println("expected  " + expected_Title);
		return false;
	}
	
	public SystemPage navigateToSystemPage(WebDriver driver) {
		advanced_btn.click();
		link.click();
		username.sendKeys("kabi\\shriyay");
		password.sendKeys("Nephro@7896");
		submitbtn.click();
		return new SystemPage(driver);
	}

}
