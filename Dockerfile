FROM gradle:jdk24-alpine AS BUILD
WORKDIR /usr/app/
COPY . .
RUN gradle build


FROM openjdk:24
WORKDIR /usr/app/
COPY --from=BUILD /usr/app/build/libs/test-deploy-app-0.0.1-SNAPSHOT.jar .
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "test-deploy-app-0.0.1-SNAPSHOT.jar"]