package com.fresenius.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.fresenius.ObjectRepository.SystemsObjectRepository;

public class SystemPage extends SystemsObjectRepository {

	WebDriver driver;

	public SystemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void links() {
		System.out.println("no if links in a page " + links.size());
		for (WebElement ele : links) {
			
			//String url=ele.getAttribute("onclick");
			//System.out.println(url);
			
			System.out.println(ele.getText());
			if(ele.getText().equals("HCP")) {
				System.out.println("InsideIf");
				ele.click();
			}

		}
	}

}
