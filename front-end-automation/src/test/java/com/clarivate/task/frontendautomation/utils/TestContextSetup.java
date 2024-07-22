package com.clarivate.task.frontendautomation.utils;

import com.clarivate.task.frontendautomation.pageobjects.PageObjectManager;

public class TestContextSetup {
	public TestBase testBase;
	public PageObjectManager pageObjectManager;
	public GenericUtils genericUtils;
	public TestContextSetup() {
		 testBase = new TestBase();
			pageObjectManager = new PageObjectManager(testBase.webDriverManager());
			genericUtils = new GenericUtils(testBase.webDriverManager());
	}

}
