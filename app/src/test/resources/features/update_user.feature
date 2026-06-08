Feature: Actualización de usuarios

  Scenario: Actualizar usuario exitosamente

    Given que deseo actualizar un usuario
    When actualizo el usuario con id 1, nombre "Liliana" y trabajo "QA Architect"
    Then la API responde con status code 200
    And la respuesta contiene el nombre "Liliana"
    And la respuesta contiene el trabajo "QA Architect"