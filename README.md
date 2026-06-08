# API Automation Serenity Challenge

## Descripción

Proyecto desarrollado como solución a un reto técnico de automatización de APIs utilizando Java, Serenity BDD, Cucumber, JUnit 5 y RestAssured.

El objetivo es automatizar la validación de las operaciones CRUD del recurso `/users` utilizando una estructura basada en el patrón Screenplay, priorizando la reutilización de código, la legibilidad y la facilidad de mantenimiento.

---

## Tecnologías utilizadas

* Java 17
* Gradle
* Serenity BDD
* Cucumber
* JUnit 5
* RestAssured
* Jackson
* Lombok

---

## Escenarios automatizados

| Método | Endpoint      | Validaciones                                                        |
| ------ | ------------- |---------------------------------------------------------------------|
| GET    | `/users`      | Status code 200 y validación de campos `id`, `name` y `email`       |
| POST | `/users` | Status code 201 y validación de campos `name` y `job` |
| PUT | `/users/{id}` | Status code 200 y validación de actualización de `name` y `job` |
| DELETE | `/users/{id}` | Status code 200 |       |

---

## Estructura del proyecto

```text
src/test/java/com/challenge
├── interactions/api     # Implementación de peticiones HTTP
├── models/request       # Modelos de datos para requests
├── questions            # Consultas sobre las respuestas recibidas
├── runners              # Runner principal de ejecución
├── stepdefinitions      # Definición de pasos Cucumber
├── tasks                # Acciones de negocio reutilizables
└── utils
    ├── config           # Configuración de ambiente
    ├── constants        # Endpoints y constantes
    └── context          # Contexto compartido entre pasos
```

---

## Arquitectura utilizada

El proyecto implementa una estructura basada en el patrón Screenplay, separando responsabilidades en componentes reutilizables.

- **Tasks:** encapsulan las acciones de negocio ejecutadas sobre la API.
- **Questions:** centralizan las validaciones realizadas sobre las respuestas.
- **Interactions:** contienen la implementación de las peticiones HTTP (GET, POST, PUT y DELETE).
- **Step Definitions:** conectan los escenarios Gherkin con la lógica automatizada.

Esta organización facilita la reutilización de código, mejora la mantenibilidad de las pruebas y permite escalar la solución de forma ordenada.

## Decisiones de diseño

Durante el desarrollo del reto busqué mantener una estructura simple, reutilizable y fácil de escalar.

* Las interacciones HTTP fueron separadas por tipo de petición (GET, POST, PUT y DELETE) para facilitar el mantenimiento.
* Se implementaron Tasks para encapsular la lógica de negocio y evitar duplicación de código.
* Se utilizaron Questions para centralizar las validaciones de respuestas.
* ScenarioContext permite compartir la respuesta HTTP entre los diferentes pasos de un mismo escenario.
* Se mantuvo un runner general para ejecutar el flujo completo CRUD.
* Se incorporaron tags de Cucumber para identificar cada operación y facilitar futuras ejecuciones segmentadas.

---

## Tags implementados

```text
@get
@post
@put
@delete
@crud
```

---

## Ejecución de pruebas

### Desde IntelliJ

Ejecutar:

```text
ApiChallengeRunner
```

### Desde consola

Ejecutar todas las pruebas:

```bash
./gradlew clean test
```

---

## Reporte Serenity

Después de ejecutar las pruebas, Serenity genera automáticamente el reporte en:

```text
app/target/site/serenity/index.html
```

---

## Consideraciones

JSONPlaceholder es un servicio de pruebas que simula operaciones CRUD. Las peticiones POST, PUT y DELETE retornan respuestas exitosas, pero no realizan cambios persistentes sobre la información almacenada.

Por esta razón, las validaciones se realizan sobre la respuesta recibida por la API y no sobre la persistencia de datos en una base de datos real.

---

## Autor

Liliana Cárdenas Fernández

SQA | Automation Learning Path
