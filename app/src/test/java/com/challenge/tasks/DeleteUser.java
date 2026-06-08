package com.challenge.tasks;

import com.challenge.interactions.api.DeleteRequest;
import com.challenge.utils.constants.ApiEndpoints;
import io.restassured.response.Response;

public class DeleteUser {

    public static Response delete(int id) {

        return DeleteRequest.to(
                ApiEndpoints.USERS + "/" + id
        );
    }
}