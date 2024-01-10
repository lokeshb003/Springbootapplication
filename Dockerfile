FROM ubuntu:latest

# Set the working directory to the location of your Maven project
WORKDIR /app

# Copy the entire project to the container
COPY . .

# Install Maven and OpenJDK 17
RUN apt update && apt install maven openjdk-17-jdk -y

# Build the Maven project
RUN mvn clean package -DskipTests=true

# Expose the port on which your application will run
EXPOSE 8080

# Run the Java application
CMD ["java", "-jar", "target/*.jar"]
