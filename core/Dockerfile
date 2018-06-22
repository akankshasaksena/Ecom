FROM java:8
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} core.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/core.jar"]