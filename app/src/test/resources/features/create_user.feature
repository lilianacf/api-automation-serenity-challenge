Feature: Creación de usuarios

  Scenario: Crear usuario exitosamente

    Given que deseo crear un usuario
    When creo un usuario con nombre "Liliana" y trabajo "QA Falcon"
    Then la API responde con status code 201
    And la respuesta contiene el nombre "Liliana"
    And la respuesta contiene el trabajo "QA Falcon"
    And la respuesta contiene un id