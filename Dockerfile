# Use Java distribution from Docker
FROM openjdk:11-jdk-alpine

# Temporary data storage used by data services like Redis
VOLUME /tmp

# Working directory for this app
WORKDIR /app

# Copy this application to a new location
COPY . /app

# Build
CMD ["./gradlew", "build", "docker"]

# Run the application from the app build folder
ENTRYPOINT ["java","-jar","/app/build/libs/cotton_factory_products-0.1.0.jar"]