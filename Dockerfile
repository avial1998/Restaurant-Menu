FROM openjdk:17
WORKDIR /app
EXPOSE 9091
COPY target/restaurant-menu.jar restaurant-menu.jar
CMD ["java","-jar","/restaurant-menu.jar"]
