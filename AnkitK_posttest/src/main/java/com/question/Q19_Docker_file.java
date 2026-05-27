//# Use Eclipse Temurin JRE 21 as base image
//FROM eclipse-temurin:21-jre
//
//# Set working directory inside container
//WORKDIR /app
//
//# Copy the JAR file from target folder
//COPY target/app.jar app.jar
//
//# Expose port 8080
//EXPOSE 8080
//
//# Run the Spring Boot application
//ENTRYPOINT ["java", "-jar", "app.jar"]




//build command :
//docker build -t myapp:latest .

//run command
//docker run -p 8080:8080 myapp:latest


