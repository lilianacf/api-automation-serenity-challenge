package com.challenge.tasks;

import com.challenge.interactions.api.PutRequest;
import com.challenge.models.request.UserRequest;
import com.challenge.utils.constants.ApiEndpoints;
import io.restassured.response.Response;

public class UpdateUser {

    public static Response update(int id, String name, String job) {

        UserRequest request =
                UserRequest.builder()
                        .name(name)
                        .job(job)
                        .build();

        return PutRequest.to(
                ApiEndpoints.USERS + "/" + id,
                request
        );
    }
}
//Recibo id, name y job.
//Armo el body.
//Apunto a /users/{id}.
//Ejecuto PUT.