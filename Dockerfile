FROM openjdk:17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn  -B dependency:go-offline

COPY src ./src
RUN mvn -B clean package
FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/restaurant-menu.jar restaurant-menu.jar
EXPOSE 9091
CMD ["java","-jar","/restaurant-menu.jar"]
