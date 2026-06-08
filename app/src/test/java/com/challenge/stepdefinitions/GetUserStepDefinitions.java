package com.challenge.stepdefinitions;

import com.challenge.questions.StatusCodeQuestion;
import com.challenge.questions.TheResponseBody;
import com.challenge.tasks.GetUser;
import com.challenge.utils.context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GetUserStepDefinitions {

    private Response response;

    @Given("que deseo consultar la lista de usuarios")
    public void queDeseoConsultarLaListaDeUsuarios() {
        // Precondición del escenario
    }

    @When("realizo la consulta de usuarios")
    public void realizoLaConsultaDeUsuarios() {
        ScenarioContext.saveResponse(
                GetUser.fromList()
        );
    }

    @Then("la API responde con status code {int}")
    public void laApiRespondeConStatusCode(int expectedStatusCode) {
        assertEquals(
                expectedStatusCode,
                StatusCodeQuestion.value(ScenarioContext.getResponse()));
    }

    @Then("la respuesta contiene id, name y email")
    public void laRespuestaContieneIdNameYEmail() {

        assertNotNull(TheResponseBody.field(ScenarioContext.getResponse(), "[0].id"));
        assertNotNull(TheResponseBody.field(ScenarioContext.getResponse(), "[0].name"));
        assertNotNull(TheResponseBody.field(ScenarioContext.getResponse(), "[0].email"));
    }
}