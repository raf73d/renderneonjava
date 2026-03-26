# ---- Build stage ----
FROM maven:3.9.6-eclipse-temurin-21 AS build

WORKDIR /app

# Copy pom.xml first and download dependencies (cache layer)
COPY pom.xml .
RUN mvn -q -e -B dependency:go-offline

# Copy the rest of the source code
COPY src ./src

# Build the Spring Boot application
RUN mvn -q -e -B clean package -DskipTests


# ---- Runtime stage ----
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/target/renderneonjava-0.0.1-SNAPSHOT.jar app.jar

# Render injecteert PORT=10000 → Spring Boot moet daarop luisteren
ENV PORT=10000

EXPOSE 10000

# Start the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]