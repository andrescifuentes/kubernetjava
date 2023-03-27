FROM eclipse-temurin:11

WORKDIR /app

COPY ./target/kubernetJava-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java","-jar","kubernetJava-0.0.1-SNAPSHOT.jar"]