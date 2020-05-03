FROM openjdk:8-jdk-alpine3.7
COPY /var/lib/jenkins/workspace/dusty/build/libs/dusty.jar /usr/bin
RUN java -jar /usr/bin/dusty.jar