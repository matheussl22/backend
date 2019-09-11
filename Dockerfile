# fetch basic image
FROM maven:3.3.9-jdk-8

# application placed into /opt/app
RUN mkdir -p /opt/app
RUN mkdir -p /opt/app/principal
RUN mkdir -p /opt/app/core

WORKDIR /opt/app

# selectively add the POM file and
# install dependencies
COPY principal/pom.xml /opt/app/principal
COPY core/pom.xml /opt/app/core
COPY pom.xml /opt/app/

RUN mvn install

# rest of the project

COPY principal/src /opt/app/principal/src
COPY core/src /opt/app/core/src

RUN mvn package

# local application port
EXPOSE 8080

# execute it
CMD ["mvn", "exec:java"]
