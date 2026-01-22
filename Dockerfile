FROM eclipse-temurin:17-jdk

EXPOSE 8080

ADD target/springboot-cicd.jar springboot-cicd.jar

ENTRYPOINT ["java","-jar","/springboot-cicd.jar"]
