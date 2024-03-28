FROM openjdk:17 AS build
WORKDIR /app
COPY ..
RUN mvn clean package -DskipTests
FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/restaurant-menu.jar restaurant-menu.jar
EXPOSE 9091
CMD ["java","-jar","/restaurant-menu.jar"]
