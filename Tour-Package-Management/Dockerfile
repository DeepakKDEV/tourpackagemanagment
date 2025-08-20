# Step 1: Use OpenJDK 17 base image
FROM openjdk:17

# Step 2: Set working directory inside container


# Step 3: Copy the built jar file from package/target into container
COPY target/Tour-Package-Management-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Expose the port your Spring Boot app runs on
EXPOSE 8081

# Step 5: Run the Spring Boot jar
ENTRYPOINT ["java", "-jar", "app.jar"]

