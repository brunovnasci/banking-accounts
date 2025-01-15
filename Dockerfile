FROM openjdk:17-jdk-slim

RUN useradd -ms /bin/bash appuser

WORKDIR /app
COPY target/app.jar app.jar

RUN chown -R appuser:appuser /app

USER appuser

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]