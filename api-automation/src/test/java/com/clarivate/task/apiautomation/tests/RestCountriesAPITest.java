package com.clarivate.task.apiautomation.tests;

import org.testng.annotations.Test;

import com.clarivate.task.apiautomation.utils.BaseTest;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
public class RestCountriesAPITest extends BaseTest {

	@Test
    public void getCountryByName() {
		System.out.println("Get country details by Name");
        Response response = given()
                .when()
                .get("/name/India")
                .then()
                .statusCode(200)
                .body("[0].name.common", equalTo("India"))
                .extract()
                .response();

        response.prettyPrint();
        
    }
	@Test
    public void getCountryByCode() {
		System.out.println("Get country details by code");
        Response response = given()
                .when()
                .get("/alpha/IN")
                .then()
                .statusCode(200)
                .body("[0].cca2", equalTo("IN"))
                .extract()
                .response();

        response.prettyPrint();
    }
	@Test
    public void validateCurrency() {
		System.out.println("validate country currency");
        Response response = given()
                .when()
                .get("/name/United States")
                .then()
                .statusCode(200)
                .body("[0].currencies.USD.symbol", equalTo("$"))
                .extract()
                .response();

        System.out.println(response.asString());
    }
}
