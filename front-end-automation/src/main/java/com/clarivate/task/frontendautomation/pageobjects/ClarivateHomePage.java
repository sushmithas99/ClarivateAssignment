package com.clarivate.task.frontendautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClarivateHomePage {
	WebDriver driver;

	public ClarivateHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "onetrust-pc-btn-handler")
	private WebElement manageCookies;
	
	@FindBy(id = "accept-recommended-btn-handler")
	private WebElement allowAll;
	
	public void clickONLink(String link) {
		By linkText = By.linkText(link);
		driver.findElement(linkText).click();
	}
	
	public void handleCookies() {
		manageCookies.click();
		
	}
	
}
