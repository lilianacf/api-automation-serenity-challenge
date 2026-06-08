Feature: Consulta de usuarios

  Scenario: Consultar lista de usuarios exitosamente

    Given que deseo consultar la lista de usuarios
    When realizo la consulta de usuarios
    Then la API responde con status code 200
    And la respuesta contiene id, name y email