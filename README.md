For checking server port : http://localhost:9000/

For accessing list of users : http://localhost:9000/swagger-ui.html#/microservice%201%20test/getAvailableUsers

Generate swagger code classes in target package which reads from api.yaml file.

Mybatis reads from generatorConfig.xml file, generates classes in dto and dao packages.

Add corresponding table names in generatorConfig.xml file

Add server port and database driver details in application.properties file

[For adding okta oauth authentication]:

Add maven dependency spring-boot-starter-security

In application.properties add oauth client-id, client-secret.

Note: Client id and client secret got when create web application in okta website.

Login with default username as user and password is which you find when you ran swagger spring boot server

