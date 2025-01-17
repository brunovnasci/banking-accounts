FROM openjdk:17-jdk-alpine

RUN apk --no-cache add curl

RUN adduser -D -s /bin/sh appuser

WORKDIR /app
COPY target/app.jar app.jar

RUN chown -R appuser:appuser /app

USER appuser

EXPOSE 8080

#HEALTHCHECK --interval=30s --timeout=10s --start-period=30s --retries=3 CMD curl -f http://localhost:8080/health || exit 1

ENTRYPOINT ["java", "-jar", "app.jar"]