FROM openjdk:11-jdk-slim-buster as builder

COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

RUN chmod +x ./gradlew
RUN ./gradlew bootjar

FROM openjdk:11-jdk-slim-buster

COPY --from=builder build/libs/*.jar kube-springboot-sampleapp.jar
VOLUME /tmp
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/kube-springboot-sampleapp.jar"]