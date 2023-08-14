# Utiliza una imagen base de Java para la construcción y ejecución
FROM adoptopenjdk:17-jre-hotspot

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo build.gradle y settings.gradle a la imagen
COPY build.gradle .
COPY settings.gradle .

# Copia el directorio src (código fuente de la aplicación) a la imagen
COPY src ./src

# Ejecuta la construcción del proyecto utilizando Gradle
RUN ./gradlew build

# Expone el puerto en el que se ejecuta la aplicación Spring Boot
EXPOSE 8081

# Comando para ejecutar la aplicación Spring Boot cuando se inicie el contenedor
CMD ["java", "-jar", "build/libs/pizzeria-0.0.1-SNAPSHOT-plain.jar"]

