package com.clarivate.task.frontendautomation.utils;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver webDriverManager() {
		try(InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Data.properties")){
			if(inputStream!=null) {
				prop = new Properties();
				prop.load(inputStream);
				if(driver == null) {
					if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
						driver = new ChromeDriver();
					}
					else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
						driver = new FirefoxDriver();
					}
					driver.get(prop.getProperty("URL"));
					driver.manage().deleteAllCookies();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
}
