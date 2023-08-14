# Etapa 1: Construir el proyecto con Gradle
FROM gradle:latest AS builder
WORKDIR /app
# Aquí deberías realizar los pasos para construir tu proyecto con Gradle

# Etapa 2: Crear la imagen final con Java y el archivo JAR construido
FROM openjdk:17-jdk
WORKDIR /app
COPY --from=builder /app/build/libs/pizzeria-0.0.1-SNAPSHOT-plain.jar /app/pizzeria-0.0.1-SNAPSHOT-plain.jar
EXPOSE 8081
CMD ["java", "-jar", "/app/pizzeria-0.0.1-SNAPSHOT-plain.jar"]
