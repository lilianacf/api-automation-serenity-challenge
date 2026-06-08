package com.challenge.utils.context;

import io.restassured.response.Response;

public class ScenarioContext {

    private static Response response;

    public static void saveResponse(Response apiResponse) {
        response = apiResponse;
    }

    public static Response getResponse() {
        return response;
    }
}