FROM amazoncorreto:21 as builder
COPY . /opt
WORKDIR /opt
RUN chmod 777 gradlew
RUN ./gradlew bootJar

FROM amazoncorretto:21-alpine3.17 as final
EXPOSE 8080
WORKDIR /opt
COPY --from=builder /opt/build/libs/*.jar final.jar
ENTRYPOINT ["java", "-jar", "final.jar"]