# TODO: build the jar file in a separate container

FROM openjdk:11-jre-slim
RUN mkdir /opt/storefinder
COPY target/storefinder-0.0.1-SNAPSHOT.jar /opt/storefinder/
WORKDIR /opt/storefinder/
CMD java -jar storefinder-0.0.1-SNAPSHOT.jar