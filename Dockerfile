# Use an official OpenJDK 17 image as the base image
FROM openjdk:17-oracle

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/fizzy-search-0.0.1-SNAPSHOT.jar /app/fizzy-search.jar

# Expose the port that your Spring Boot application runs on
EXPOSE 8080

# Command to run your Spring Boot application
CMD ["java", "-jar", "fizzy-search.jar"]
