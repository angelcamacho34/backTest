# Intercam backend test

### Ejecución del proyecto 
Para ejecutar el proyecto sigue los siguientes pasos:

* Descomprime el archivo .zip que recibiste o descargalo de [Github](https://github.com/angelcamacho34/backTest).
* Es necesario que tengas installado java en su version 1.8_x.
* Ademas debes tener instalado Maven preferentemente es su version 3.6.x
* Ejecuta una instancia del proyecto con el comando``mvn spring-boot:run``.
* La base de datos se encuentra en H2 alojada en memoria, al iniciar el proyecto la base de datos estaraá iniciada con 4 registros.
* Si necesitas modificar los registros una vez iniciada la instancia del proyecto puedes ir a [localhost](http://localhost:8090/h2-console).
* En el campo JDBC URL debe estar la ruta ``jdbc:h2:mem:testdb``, el usuario es ``sa``y la contraseña ``password`


