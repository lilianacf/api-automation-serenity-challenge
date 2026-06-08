package com.challenge.questions;
// Question encargada de obtener el status code
// de la última respuesta recibida por la API.

import net.serenitybdd.rest.SerenityRest;
//Voy a usar Serenity para acceder a la última respuesta de la API.
import io.restassured.response.Response;
import com.challenge.questions.StatusCodeQuestion;
import com.challenge.questions.TheResponseBody;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StatusCodeQuestion {

    //int = Voy a devolver un número entero.
    //value = Dame el valor.
    //public static int value() = Método reutilizable que devuelve el status code.
    public static int value(Response response) {
        //return SerenityRest.lastResponse() = Trae la última respuesta recibida por la API.
        //.getStatusCode();=  Obtén el código HTTP de esa respuesta.
        return response.getStatusCode();

    }
}
//StatusCodeQuestion
//Pregunta cuál fue el código HTTP de la última respuesta recibida por la API y devuélvelo como un entero.
//De esta respuesta que me pasas, dime cuál fue el status code.