FROM maven:3.9.4-amazoncorretto-17

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean package -DskipTests

CMD [ "mvn", "spring-boot:run" ]