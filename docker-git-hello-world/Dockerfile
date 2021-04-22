# Updated as of Aug 16, 2017
# Install FROM UBUNTU IMAGE
FROM ubuntu:18.04

#Author of the Docker File
# MAINTAINER Pictolearn Note: MAINTAINER has been deprecated for LABEL, 
# LABEL is a key value pair 
MAINTAINER azrafayel

# RUN COMMAND BASICALLY runs the command in the terminal and creates an image.
# Install all the updates for UBUNTU
RUN apt-get update && apt-get install -y software-properties-common && \
## for UBUNTU >= 12.10 apt-get install software-properties-common


# Install all the updates for UBUNTU
apt-get install -y iputils-ping && \

# Adds the repository where JDK 8 can be obtained for UBUNTU
### RUN add-apt-repository ppa:webupd8team/java
add-apt-repository ppa:linuxuprising/java && \

# INSTALL THE VI EDITOR AND MYSQL-CLIENT
apt-get install -y vim && \
apt-get install -y mysql-client && \

# NOTE and WARNING: ORACLE JDK is no longer licensed. Please install default jdk or OPEN JDK. 
# The initial set up was to get this working with JDK 7 but when the licensing terms for oracle changing we will install the default JDK
# INSTALL ORACLE JDK 8 BY ACCEPTING YES
##RUN echo "oracle-java14-installer shared/accepted-oracle-license-v1-2 boolean true" | debconf-set-selections
#INSTALL ALL the updates again and install MAVEN and JDK 8
# RUN apt-get update && apt-get install -y oracle-java8-installer maven
apt-get update && apt-get install -y default-jdk maven
##RUN apt-get update && apt-get install -y oracle-java14-installer maven

# ADD a directory called docker-git-hello-world inside the UBUNTU IMAGE where you will be moving all of these files under this 
# DIRECTORY to
RUN mkdir -p /application
COPY * /application
WORKDIR /application

# AFTER YOU HAVE MOVED ALL THE FILES GO AHEAD CD into the directory and run mvn assembly.
# Maven assembly will package the project into a JAR FILE which can be executed

RUN mvn clean && mvn package

#THE CMD COMMAND tells docker the command to run when the container is started up from the image. In this case we are
# executing the java program as is to print Hello World.
##ENTRYPOINT ["java", "-jar", "hello-world-java-1.0.0-SNAPSHOT-jar-with-dependencies.jar"]
CMD ["java", "-cp", "/application/target/hello-world-java-1.0.0-SNAPSHOT.jar", "fr.smile.docker.App"]