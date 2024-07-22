package com.clarivate.task.frontendautomation.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {
	WebDriver driver;

	public ResultsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='MjjYud']/div[contains(@class,'g')]//a/h3")
	private List<WebElement> results;
	
	@FindBy(xpath = "//div[@class='MjjYud']/div[contains(@class,'g')]//a/h3/parent::a")
	private List<WebElement> urls;

	public List<WebElement> getAllResults() {
		return results;
	}
	
	public WebElement goToWebsite(String url) {
		WebElement actualUrl = urls.stream().filter(r->r.getAttribute("href").equals(url)).findFirst().orElse(null);
		return actualUrl;
	}
}
