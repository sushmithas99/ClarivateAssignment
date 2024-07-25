package com.clarivate.task.apiautomation.utils;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;

public class BaseTest {
	@BeforeTest
	 public static void setup() {
        RestAssured.config = RestAssured.config()
                .sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());

        RestAssured.baseURI = "https://restcountries.com/v3.1";
    }
}
