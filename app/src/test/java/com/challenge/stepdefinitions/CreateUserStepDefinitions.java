package com.challenge.stepdefinitions;

import com.challenge.tasks.CreateUser;
import com.challenge.utils.context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import com.challenge.questions.TheResponseBody;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateUserStepDefinitions {

    private Response response;

    @Given("que deseo crear un usuario")
    public void queDeseoCrearUnUsuario() {

    }

    @When("creo un usuario con nombre {string} y trabajo {string}")
    public void creoUnUsuarioConNombreYTrabajo(
            String name,
            String job) {

        ScenarioContext.saveResponse(
                CreateUser.create(name, job)
        );
    }


    @Then("la respuesta contiene el nombre {string}")
    public void laRespuestaContieneElNombre(String expectedName) {

        assertEquals(
                expectedName,
                TheResponseBody.field(ScenarioContext.getResponse(), "name")
        );
    }

    @Then("la respuesta contiene el trabajo {string}")
    public void laRespuestaContieneElTrabajo(String expectedJob) {

        assertEquals(
                expectedJob,
                TheResponseBody.field(ScenarioContext.getResponse(), "job")
        );
    }

    @Then("la respuesta contiene un id")
    public void laRespuestaContieneUnId() {

        assertNotNull(
                TheResponseBody.field(ScenarioContext.getResponse(), "id")
        );
    }
}