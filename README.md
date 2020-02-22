# spring-boot-docker basic skeleton architechture Project
Use this project as a base project for creating spring boot docker ready applications
## Getting Started
Things to follow for utilizing this base project
Use Eclipse IDE  and Maven for building jar
<br>Use cmd for testing jar
<br>Use Git bash for docker commands

### Prerequisites
* Install Eclipse IDE
* [Maven](https://maven.apache.org/) - Dependency Management
* Docker for your specific OS

## Now, Follow below Steps: 
Step 1) Build Jar
Command: 
```bash
mvn clean install
```
Note:- Always Test your jars using 
CMD command:
```bash
java -jar <JarFile>
```
Step 2) Build image from jar
Create the Dockerfile, as created in this basic architecture project(use Git bash)
Command:
```bash
docker build -f Dockerfile -t sam253narula/docker-spring-boot .
```
Step 3) verify Image is created, using 
Command : 
```bash
docker images
```
Step 4)Test your image by running it in a container, use
command: 
```bash
docker run -p 9999:9999 sam253narula/docker-spring-boot
```
Step 5) Push your image to Docker Hub, using
Command: 
```bash
docker push sam253narula/docker-spring-boot
```
### Referance used
https://docker-curriculum.com/

