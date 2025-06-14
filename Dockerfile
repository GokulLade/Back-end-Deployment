FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

RUN ./mvnw clean install -DskipTests

CMD ["java", "-jar", "target/backend-0.0.1-SNAPSHOT.jar"]
