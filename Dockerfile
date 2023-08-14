# Etapa 1: Construir el proyecto con Gradle
FROM gradle:latest AS builder
# Establecer el directorio de trabajo en la ubicación del proyecto
WORKDIR /app
# Copiar el archivo build.gradle y settings.gradle al directorio de trabajo
COPY build.gradle settings.gradle ./
# Copiar todo el código fuente del proyecto al directorio de trabajo
COPY src/ ./src/
# Ejecutar el comando de construcción del proyecto Gradle
RUN gradle build
# Etapa 2: Crear la imagen final con Java y el archivo JAR construido
FROM openjdk:17-jdk
# Establecer el directorio de trabajo en la ubicación del proyecto
WORKDIR /app
# Copiar el archivo JAR construido desde la etapa anterior al directorio de trabajo
COPY --from=builder /app/build/libs/pizzeria-0.0.1-SNAPSHOT-plain.jar /app/pizzeria-0.0.1-SNAPSHOT-plain.jar
# Exponer el puerto en el que se ejecutará la aplicación
EXPOSE 8081
# Comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "/app/pizzeria-0.0.1-SNAPSHOT-plain.jar"]
