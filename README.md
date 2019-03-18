# PRUEBAS SPRING CLOUD

## Introducción

Proyecto para hacer pruebas con spring cloud stream y algunos binders

## Requerimientos
- Apache Maven 3 - https://maven.apache.org/download.cgi
- JDK 1.8 - http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- Docker - https://docs.docker.com/docker-for-windows/
- Docker compose - https://docs.docker.com/compose/install/

## Puesta en marcha

## Arranacar JMS
Arrancar rabbitmq con docker-compose con el fichero de /rabbitmq
```
$ docker-compose up
```
Tendremos disponible una gui web en http://localhost:15672

## Arrancar App en local
Se puede arrancar la aplicación utilizando el plugin de Spring Boot de Maven, ejecutando el siguiente comando desde los plugins de maven:
```
mvn spring-boot:run
```




