FROM ubuntu:latest
WORKDIR .
RUN apt update && apt install maven openjdk=11-jdk -y
RUN mvn clean package -DskipTests=true
EXPOSE 8080
CMD [ "java -jar target/*.jar"]
