FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/ejercicios-practicos-curso-0.0.1.jar
COPY ${JAR_FILE} app_cursos.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_cursos.jar"]