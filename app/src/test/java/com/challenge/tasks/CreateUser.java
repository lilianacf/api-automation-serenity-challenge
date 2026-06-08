package com.challenge.tasks;

import com.challenge.interactions.api.PostRequest;
import com.challenge.models.request.UserRequest;
import com.challenge.utils.constants.ApiEndpoints;
import io.restassured.response.Response;

public class CreateUser {

    public static Response create(String name, String job) {

        UserRequest request =
                UserRequest.builder()
                        .name(name)
                        .job(job)
                        .build();

        return PostRequest.to(
                ApiEndpoints.USERS,
                request
        );
    }
}

//Recibo name y job,
//armo el body UserRequest,
//y lo envío con POST a /users.