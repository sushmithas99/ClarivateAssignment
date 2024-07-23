package com.clarivate.task.frontendautomation.stepdefinitions;

import com.clarivate.task.frontendautomation.utils.TestContextSetup;

import io.cucumber.java.After;

public class Hooks {
	TestContextSetup testContext;
	public Hooks(TestContextSetup testContext) {
		this.testContext = testContext;
	}
	@After
	public void AfterScenario() 
	{
		
		testContext.testBase.webDriverManager().quit();
		
	}
}
