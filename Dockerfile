FROM maven:latest AS build
WORKDIR /app
COPY pom.xml .

COPY src ./src
RUN mvn --version
RUN mvn  clean package 
FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/restaurant-menu.jar restaurant-menu.jar
EXPOSE 9091
CMD ["java","-jar","/restaurant-menu.jar"]
