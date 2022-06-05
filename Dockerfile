FROM openjdk:17-jdk-alpine

ARG JAR_FILE=build/libs/graphql-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8080