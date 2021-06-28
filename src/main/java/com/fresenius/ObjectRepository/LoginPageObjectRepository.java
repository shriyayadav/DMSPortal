package com.fresenius.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectRepository {
	
	@FindBy(id="user")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='passwd']")
	public WebElement password;
	
	@FindBy(id="submit")
	public WebElement submitbtn;
	
	@FindBy(xpath="//button[@id='details-button']")
	public WebElement advanced_btn;
	
	@FindBy(xpath="//a[@id='proceed-link']")
	public WebElement link;
	
	@FindBy(xpath="//span[contains(text(),'Global')]")
	public WebElement title_text;
	
	
	
	

}
