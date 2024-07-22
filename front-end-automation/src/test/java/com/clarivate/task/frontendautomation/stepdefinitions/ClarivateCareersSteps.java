package com.clarivate.task.frontendautomation.stepdefinitions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.clarivate.task.frontendautomation.pageobjects.ClarivateHomePage;
import com.clarivate.task.frontendautomation.pageobjects.GooglePage;
import com.clarivate.task.frontendautomation.pageobjects.ResultsPage;
import com.clarivate.task.frontendautomation.utils.TestContextSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClarivateCareersSteps {
	public WebDriver driver;
	TestContextSetup testContext;

	public ClarivateCareersSteps(TestContextSetup testContext) {
		this.testContext = testContext;
	}

	@Given("I Navigate to Google")
	public void iNavigateToGoogle() throws InterruptedException {
		
	}

	@When("I search for {string}")
	public void iSearchFor(String query) {
		GooglePage googlePage = testContext.pageObjectManager.getMeGooglePage();
		googlePage.search(query);
	}

//	@Then("I write the titles of all results on the first page to a text file")
//	public void iWriteTheTitlesToATextFile() {
//		ResultsPage resultsPage = testContext.pageObjectManager.getMeResultsPage();
//		List<WebElement> allResults = resultsPage.getAllResults();
//
//		testContext.genericUtils.addAllResultsToTextFile(allResults);
//	}

	@Given("I navigate to the {string} website from Google search results")
	public void navigateToTheWebsiteFromGoogleSearch(String website) {
		ResultsPage resultsPage = testContext.pageObjectManager.getMeResultsPage();
		resultsPage.goToWebsite(website).click();
		
	}

	@When("I click on the {string} link")
	public void iClickOnTheLink(String link) {
		ClarivateHomePage clarivateHomePage = testContext.pageObjectManager.getMeClarivateHomePage();
		clarivateHomePage.handleCookies();
		clarivateHomePage.clickONLink(link);
		testContext.genericUtils.switchToChildWindow();
	}

	@When("I filter the list for {String} jobs in {String}")
	public void filterTheList(String category, String Location) {
		
	}

//	@Then("the number of jobs shown matches the count in the brackets")
//	public void theNumberOfJobsShownMatches() {
//
//	}
}
