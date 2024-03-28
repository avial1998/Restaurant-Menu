FROM openjdk:17
EXPOSE 9091
ADD target/restaurant-menu.jar restaurant-menu.jar
ENTRYPOINT ["java","-jar","/restaurant-menu.jar"]
