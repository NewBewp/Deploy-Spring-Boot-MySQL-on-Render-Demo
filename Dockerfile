FROM maven:3.9.9-eclipse-temurin-21 AS build
COPY . .
RUN mvn clean package -DskipTest

FROM eclipse-temurin:21-alpine
COPY --from=build /target/*.jar demo.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "demo.jar"]