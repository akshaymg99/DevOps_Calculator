FROM openjdk:8
ARG target/calculator-devops-1.0-SNAPSHOT.jar calculator-devops-1.0-SNAPSHOT.jar
RUN mkdir -p -m 777 /var/log/tomcat
EXPOSE 8088
ENTRYPOINT ["java","-jar","calculator-devops-1.0-SNAPSHOT.jar"]
