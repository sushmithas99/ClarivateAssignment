package com.clarivate.task.frontendautomation.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericUtils {
	WebDriver driver;
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void addAllResultsToTextFile(List<WebElement> results) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("google_search_results.txt"))) {
			for (WebElement result : results) {
				writer.write(result.getText());
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}