package com.challenge.runners;

import com.challenge.questions.StatusCodeQuestion;
import com.challenge.questions.TheResponseBody;
import com.challenge.tasks.GetUser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.restassured.response.Response;

// Test encargado de validar la consulta de usuarios
public class GetUserTest {
    @Test
    void shouldGetUsersSuccessfully() {
        // Ejecuta la acción de negocio: consultar usuarios
        Response response = GetUser.fromList();
        // Valida que el status code recibido sea 200
        assertEquals(200, StatusCodeQuestion.value(response));

        assertNotNull(
                TheResponseBody.field(response, "[0].id"));

        assertNotNull(
                TheResponseBody.field(response, "[0].name"));

        assertNotNull(
                TheResponseBody.field(response, "[0].email"));


    }
}
//Cuando consulte la lista de usuarios,
//espero que la API responda status code 200.