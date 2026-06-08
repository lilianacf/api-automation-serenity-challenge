package com.challenge.interactions.api;
import com.challenge.utils.config.EnvironmentConfig;
// Importa Serenity REST para ejecutar requests HTTP
import static io.restassured.RestAssured.given;
// Clase reutilizable para centralizar requests GET
import io.restassured.response.Response;
public class GetRequest {

        // Método público y reutilizable
        // static = no necesita crear objetos
        // void = no retorna información todavía
        // endpoint = recibe la ruta de la API
        public static Response to (String endpoint) {
                // Inicia construcción de request HTTP

                        // Configura request
                return given()
                        .relaxedHTTPSValidation()
                        //Antes de hacer el GET, toma la URL base desde serenity.conf y súmale el endpoint recibido.
                        .baseUri(EnvironmentConfig.getBaseUrl())
                        // Imprime request completa en consola/reportes
                        .log().all()
                        // Marca momento de ejecución
                        .when()
                        // Ejecuta GET al endpoint recibido
                        .get(endpoint);
        }
}
//Haz el GET y devuélveme la respuesta completa.