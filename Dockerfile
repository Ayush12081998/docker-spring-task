FROM openjdk:8
EXPOSE 8080
ADD target/docker-spring-task.jar docker-spring-task.jar
ENTRYPOINT ["java","-jar","docker-spring-task.jar"]  