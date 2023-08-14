FROM gradle:7.6 AS builder

COPY build.gradle ./
COPY src ./src

RUN gradle build

FROM openjdk:17

WORKDIR /app

COPY --from=builder /home/gradle/build/libs/*.jar app.jar

EXPOSE 8081

CMD ["java", "-jar", "app.jar"]