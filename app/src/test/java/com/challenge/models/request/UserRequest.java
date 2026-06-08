package com.challenge.models.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequest {

    private String name;
    private String job;
}

//Este es el molde del body que voy a enviar para crear un usuario.
//El POST enviará name y job.