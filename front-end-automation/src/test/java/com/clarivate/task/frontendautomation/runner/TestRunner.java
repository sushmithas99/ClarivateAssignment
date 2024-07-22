package com.clarivate.task.frontendautomation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/java/com/clarivate/task/frontendautomation/features", glue = "com/clarivate/task/frontendautomation/stepdefinitions", monochrome = true, plugin = {
		"pretty", "html:target/output.html" })
public class TestRunner extends AbstractTestNGCucumberTests {

}
