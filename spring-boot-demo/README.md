# spring-boot-demo

## Install
    mvn clean install

## Run
    mvn spring-boot:run

## Run with docker
1. Compile and create docker image

       mvn compile jib:dockerBuild

2. Docker compose

       docker compose up

3. Or run the container

       docker run -it --rm -p 8036:8036 spring-boot-demo:1.0.0
