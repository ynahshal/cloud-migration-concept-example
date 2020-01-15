FROM openjdk:8-jre-alpine

COPY ./target/*.war /webApp.war

CMD ["/usr/bin/java", "-jar", "/webApp.war"]