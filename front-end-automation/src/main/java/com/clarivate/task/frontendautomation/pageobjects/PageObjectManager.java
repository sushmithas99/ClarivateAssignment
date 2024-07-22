package com.clarivate.task.frontendautomation.pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public GooglePage getMeGooglePage() {
		return new GooglePage(driver);
	}
	public ResultsPage getMeResultsPage() {
		return new ResultsPage(driver);
	}
	public ClarivateHomePage getMeClarivateHomePage() {
		return new ClarivateHomePage(driver);
	}
}
