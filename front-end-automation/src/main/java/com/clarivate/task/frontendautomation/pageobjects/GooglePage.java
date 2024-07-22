package com.clarivate.task.frontendautomation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	WebDriver driver;

	public GooglePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	private WebElement searchBox;

	public void search(String value) {
		searchBox.sendKeys(value);
		searchBox.submit();
	}
}
