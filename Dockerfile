FROM openjdk:24
ADD /build/libs/test-deploy-app-0.0.1-SNAPSHOT.jar test-deploy-app-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "test-deploy-app-0.0.1-SNAPSHOT.jar"]