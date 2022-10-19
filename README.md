# TIENDA DE PRODUCTOS CONGELADOS

Servidor para un eccomerce de caracter educativo para AYI Academy

Este proyecto fue construido con JAVA SpringBoot

## Paso a paso para utilizar el servidor

### SERVIDOR

1- Descargar o clonar el proyecto desde [Backend SG Congelados](https://github.com/NClemente91/BackendJavaSGCongelados.git)

2- Una vez descargado, abrir el proyecto con un ide y asegurarse de que se instalen todas las dependencias.

3- Se deberá tener instalado MySql y asegurarse de que este corriendo en su máquina. Además, desde alguna herramienta de gestión de base de datos, MySQL Workbench por ejemplo, crear un esquema de base de datos con el nombre de "sg_congelados_db". Asegurarse de que el nombre sea el correcto.

4- Correr el servidor configurando previamente las variables de entorno del proyecto como lo son DB_PORT=3306, DB_HOST=localhost, DB_USERNAME="tu usuario de base de datos", DB_PASSWORD="tu contraseña de base de datos" y DB_DATABASE=sg_congelados_db.

5- Controlar que el servidor este funcionando de manera correcta desde Postman o desde Swagger en el siguiente link [Swagger](http://localhost:8080/swagger-ui.html#!/). Se puede hacer una prueba con productos que ya vienen precargados.

6- Se puede tambien descargar el frontend realizado para este proyecto desde [Frontend SG Congelados](https://github.com/NClemente91/FrontendReactSGCongelados.git)
