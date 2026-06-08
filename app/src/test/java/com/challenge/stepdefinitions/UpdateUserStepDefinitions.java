package com.challenge.stepdefinitions;

import com.challenge.tasks.UpdateUser;
import com.challenge.utils.context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateUserStepDefinitions {

    @Given("que deseo actualizar un usuario")
    public void queDeseoActualizarUnUsuario() {

    }

    @When("actualizo el usuario con id {int}, nombre {string} y trabajo {string}")
    public void actualizoElUsuarioConIdNombreYTrabajo(
            int id,
            String name,
            String job) {

        ScenarioContext.saveResponse(
                UpdateUser.update(id, name, job)
        );
    }
}