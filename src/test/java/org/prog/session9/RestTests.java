package org.prog.session9;

import groovy.json.JsonOutput;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static groovy.json.JsonOutput.prettyPrint;

//TODO: add check for location.street.number
//TODO: add check for location.street.name
//TODO: add check for location.coordinates.latitude
//TODO: add check for location.coordinates.longitude

public class RestTests {

    @Test
    public void myRestTest() {
        Response response = RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("api/")
                .queryParam("inc", "location")
                .queryParam("results", 5)
                .queryParam("noinfo")
                .get();
        System.out.println("===========================================");
        System.out.println(response.prettyPrint());
        response.then()
                .contentType(ContentType.JSON)
                .body("results.location.street.number", Matchers.everyItem(Matchers.notNullValue()))
                .body("results.location.street.name", Matchers.everyItem(Matchers.notNullValue()))
                .body("results.location.coordinates.latitude", Matchers.everyItem(Matchers.notNullValue()))
                .body("results.location.coordinates.longitude", Matchers.everyItem(Matchers.notNullValue()));

    }
}
