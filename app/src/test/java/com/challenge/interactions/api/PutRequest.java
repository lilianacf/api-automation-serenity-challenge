package com.challenge.interactions.api;

import com.challenge.utils.config.EnvironmentConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PutRequest {

    public static Response to(String endpoint, Object body) {

        return given()
                .relaxedHTTPSValidation()
                .baseUri(EnvironmentConfig.getBaseUrl())
                .contentType(ContentType.JSON)
                .body(body)
                .log().all()
                .when()
                .put(endpoint);
    }
}