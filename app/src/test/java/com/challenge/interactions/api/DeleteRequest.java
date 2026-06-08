package com.challenge.interactions.api;

import com.challenge.utils.config.EnvironmentConfig;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DeleteRequest {

    public static Response to(String endpoint) {

        return given()
                .relaxedHTTPSValidation()
                .baseUri(EnvironmentConfig.getBaseUrl())
                .log().all()
                .when()
                .delete(endpoint);
    }
}