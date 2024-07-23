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

	@FindBy(css = "#CityAccordion")
	private WebElement citySec;

	
	
	@FindBy(xpath = "//label[text()='Bangalore ']/span/span")
	private WebElement technology;

	public void searchCareers(String place, String category) {
		searchBox.sendKeys(category);
		searchBtn.click();
		citySec.click();
		By city =By.xpath("//label[text()='Bangalore ']/span/span");
		driver.findElement(city).click();
	}
	public String getCount() {
		By placeRes =By.xpath("//label[text()='Bangalore ']/span/span");
		String countInBrackets = driver.findElement(placeRes).getText();
		String count = countInBrackets.replaceAll("[^0-9]","");
		return count;
	}
}
