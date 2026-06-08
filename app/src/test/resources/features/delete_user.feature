Feature: Eliminación de usuarios

  Scenario: Eliminar usuario exitosamente

    Given que deseo eliminar un usuario
    When elimino el usuario con id 1
    Then la API responde con status code 200