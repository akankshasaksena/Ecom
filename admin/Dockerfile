FROM java:8
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} admin.jar
EXPOSE 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/admin.jar"]