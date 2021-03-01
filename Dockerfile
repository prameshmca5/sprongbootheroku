FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/springheroku-0.0.1-SNAPSHOT.jar springheroku-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springheroku-0.0.1-SNAPSHOT.jar"]