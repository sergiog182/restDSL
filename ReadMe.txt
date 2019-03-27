Proyecto Rest service con RestDSL
=================================

El proyecto expone un servicio REST bajo la ruta localhost:8080/User, con cuatro funciones:
* GET: localhost:8080/User/12
* POST: localhost:8080/User
* PUT: localhost:8080/User
* DELETE: localhost:8080/User/12

Para correr el proyecto, desde consola ejecutar:

    mvn clean camel:run

Desde JBoss developer studio, crear un perfil de ejecuciÃ³n:

	clean camel:run
