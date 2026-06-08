package com.challenge.questions;
import io.restassured.response.Response;
public class TheResponseBody {
    public static Object field(Response response, String path) {
        return response.jsonPath().get(path);
    }
}

