FROM openjdk:8
ADD target/calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar
EXPOSE 4000
ENTRYPOINT ["java","-cp","calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar", "calculator.App"]
