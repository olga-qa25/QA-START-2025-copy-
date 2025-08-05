package org.prog.session11.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.prog.session9.ResultsDto;


public class HWRestStep {

    public static ResultsDto response;

    @Given("request {int} random people from API")
    public void requestPersonsFromAPI(int amount) {
        Response response = RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("api/")
                .queryParam("inc", "gender,name,location,nat")
                .queryParam("results", amount)
                .queryParam("noinfo")
                .get();
//        response.prettyPrint();
        HWRestStep.response = response.as(ResultsDto.class);

    }
}
