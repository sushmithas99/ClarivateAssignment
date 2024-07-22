package com.clarivate.task.frontendautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPage {
	WebDriver driver;
String category;
	public CareersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id = "typehead")
	private WebElement searchBox;

	@FindBy(id = "ph-search-backdrop")
	private WebElement searchBtn;

	@FindBy(css = "#CategoryAccordion span")
	private WebElement categorySec;

	
	
//	@FindBy(xpath = "")
//	private WebElement technology;

	public void searchCareers(String place, String category) {
		searchBox.sendKeys(place);
		searchBtn.click();
		categorySec.click();
		By technology =By.xpath("//input[contains(@id,"+category+")]");
		driver.findElement(technology).click();
	}
}
