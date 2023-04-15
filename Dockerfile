# Maven build container 

FROM maven:3.8.5-openjdk-11 AS maven_build

ARG GITHUB_RUN_NUMBER=1234
ENV GITHUB_RUN_NUMBER=${GITHUB_RUN_NUMBER}

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

#pull base image

FROM openjdk:11-jdk-slim


#expose port 8080
EXPOSE 8080


#copy hello world to docker image from builder image

COPY --from=maven_build /tmp/target/hello-world-0.1.0.jar /data/hello-world-0.1.0.jar

#default command
CMD ["java", "-jar", "/data/hello-world-0.1.0.jar"]
