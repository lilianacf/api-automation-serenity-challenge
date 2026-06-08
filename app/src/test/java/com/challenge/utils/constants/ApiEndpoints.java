package com.challenge.utils.constants;

// Centraliza endpoints reutilizables del framework

//“Guarda en un solo lugar las rutas de la API para no escribirlas manualmente en cada test.”
public class ApiEndpoints {
    // Constante global que guarda el endpoint base de usuarios
    // public = se puede usar desde otras clases
    // static = no necesito crear un objeto de ApiEndpoints
    // final = este valor no debe cambiar
    // String = guarda texto
    public static final String USERS = "/users";

    // Constante global para consultar un usuario específico
    // %s funciona como espacio reemplazable para poner el id del usuario
    public static final String SINGLE_USER = "/users/%s";
}
