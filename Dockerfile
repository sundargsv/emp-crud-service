#  Create a new image from the base java 8 image.
FROM openjdk:8

# Add jar into it
ADD target/employee.jar employee.jar

# Expose the app in port no
EXPOSE 8082

# main command
ENTRYPOINT ["java", "-jar", "employee.jar"]

# docker build -f DockerFile -t emp:latest .
#pushing a app into port and inside the container I have 8085
# docker run -p 8082:8082 emp:latest