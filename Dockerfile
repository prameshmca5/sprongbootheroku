FROM openjdk:8-jdk
EXPOSE 8080
ADD target/spring-heroku-app.jar spring-heroku-app.jar
ENTRYPOINT ["java","-jar","/spring-heroku-app.jar"]