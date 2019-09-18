# spring-boot-plsql
Communiquer à une database PLSQL à partir d'une app Java

## Installation
- Download ojdbc7.jar sur https://www.oracle.com/database/technologies/jdbc-drivers-12c-downloads.html
- Installer avec la commande
```
mvn install:install-file -Dfile={Path/to/your/ojdbc7.jar} -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0 -Dpackaging=jar
```
- Inscrire user/password à la database dans le application properties
- Lancer avec 
```
mvn spring-boot:run
```

Reference: https://medium.com/skillhive/spring-boot-spring-data-jpa-and-oracle-database-c4af89f727e0
