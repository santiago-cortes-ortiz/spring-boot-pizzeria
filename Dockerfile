FROM openjdk:17-jdk
# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app
# Copia los archivos Gradle wrapper y de configuración
COPY gradlew .
COPY gradle ./gradle
COPY settings.gradle .
# Copia el archivo build.gradle a la imagen
COPY build.gradle .
# Copia el directorio src (código fuente de la aplicación) a la imagen
COPY src ./src
# Descargar las dependencias de Gradle
RUN ./gradlew dependencies
# Ejecuta la construcción del proyecto utilizando Gradle
RUN ./gradlew build
# Expone el puerto en el que se ejecuta la aplicación Spring Boot
EXPOSE 8081
# Comando para ejecutar la aplicación Spring Boot cuando se inicie el contenedor
CMD ["java", "-jar", "build/libs/pizzeria-0.0.1-SNAPSHOT-plain.jar"]
