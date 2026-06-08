package com.challenge.interactions.api;

import com.challenge.utils.config.EnvironmentConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

// Clase reutilizable para centralizar requests POST
public class PostRequest {

    // endpoint = ruta donde quiero crear el recurso
    // body = información que voy a enviar en el request
    public static Response to(String endpoint, Object body) {

        return given()
                .relaxedHTTPSValidation()
                .baseUri(EnvironmentConfig.getBaseUrl())
                .contentType(ContentType.JSON)
                .body(body)
                .log().all()
                .when()
                .post(endpoint);
    }
}

//Haz un POST al endpoint que te pasen,
//envía este body en formato JSON,
//y devuélveme la respuesta.