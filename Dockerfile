FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/springheroku-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} springheroku-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springheroku-0.0.1-SNAPSHOT.jar"]