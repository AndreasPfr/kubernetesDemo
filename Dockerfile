FROM openjdk:8-alpine
EXPOSE 8080

RUN mkdir -p /app
WORKDIR /app

COPY target/*.jar app.jar

RUN chown -R nobody app.jar

USER nobody
CMD java -jar app.jar

