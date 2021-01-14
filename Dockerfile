FROM maven:3.6.3-jdk-11 AS build
WORKDIR /usr/src/app
COPY . /usr/src/app


RUN mvn clean package -U


FROM adoptopenjdk:14-jre-hotspot
RUN mkdir /app
WORKDIR /app
COPY --from=build ./usr/src/app/target/ad-realestate-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080
CMD ["java", "-jar", "ad-realestate-0.0.1-SNAPSHOT.jar"]