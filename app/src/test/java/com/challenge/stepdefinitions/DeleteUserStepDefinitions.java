package com.challenge.stepdefinitions;

import com.challenge.tasks.DeleteUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DeleteUserStepDefinitions {

    @Given("que deseo eliminar un usuario")
    public void queDeseoEliminarUnUsuario() {

    }

    @When("elimino el usuario con id {int}")
    public void eliminoElUsuarioConId(int id) {

        ScenarioContext.saveResponse(
                DeleteUser.delete(id)
        );
    }
}