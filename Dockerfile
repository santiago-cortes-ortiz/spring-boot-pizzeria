FROM gradle:latest AS builder
FROM openjdk:17-jdk
WORKDIR /app
RUN echo "Deploying application..."
COPY --from=builder /app/inventory/build/libs/pizzeria-0.0.1-SNAPSHOT-plain.jar /app/pizzeria-0.0.1-SNAPSHOT-plain.jar
EXPOSE 8081
CMD ["java", "-jar", "/app/pizzeria-0.0.1-SNAPSHOT-plain.jar"]
RUN echo "Application deployed successfully :)"
