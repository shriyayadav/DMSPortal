package com.fresenius.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemsObjectRepository {
	
	@FindBy(xpath="//div[@id='gp_clientless_apps']//following::p")
	public List<WebElement> links;

}
