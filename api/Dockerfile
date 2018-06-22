FROM java:8
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} api.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/api.jar"]