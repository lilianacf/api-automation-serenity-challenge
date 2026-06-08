package com.challenge.tasks;
//GetUser:
//Cuando alguien quiera consultar usuarios,
//utiliza la herramienta GetRequest
//y ejecuta un GET contra el endpoint USERS.

//Voy a usar la herramienta que sabe hacer GET.
import com.challenge.interactions.api.GetRequest;
//Voy a usar las rutas centralizadas.
import com.challenge.utils.constants.ApiEndpoints;
import io.restassured.response.Response;
public class GetUser {
    //Crea una acción reutilizable llamada "consultar lista de usuarios".
    public static Response fromList() {
        //Haz un GET al endpoint /users.
        return GetRequest.to(ApiEndpoints.USERS);
    }
}
//Consulta usuarios y devuélveme la respuesta.