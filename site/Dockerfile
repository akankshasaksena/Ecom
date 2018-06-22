FROM java:8
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} ROOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ROOT.jar"]