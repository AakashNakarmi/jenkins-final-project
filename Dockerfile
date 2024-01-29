FROM openjdk:17
EXPOSE 8080
ADD target/jenkins-final-project.jar jenkins-final-project.jar
ENTRYPOINT ["java", "-jar", "/jenkins-final-project.jar"]