FROM openjdk:8
EXPOSE 8080
ADD target/docker_jenkins_pipeline.jar docker_jenkins_pipeline.jar 
ENTRYPOINT [ "java", "-jar","/docker_jenkins_pipeline.jar" ]