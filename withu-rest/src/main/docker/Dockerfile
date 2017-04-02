FROM frolvlad/alpine-oraclejdk8:slim

COPY withu-rest-1.0-SNAPSHOT.jar /withu-rest-1.0-SNAPSHOT.jar
EXPOSE 8080
EXPOSE 3306
ENTRYPOINT [ "sh", "-c", "java -jar /withu-rest-1.0-SNAPSHOT.jar" ]
