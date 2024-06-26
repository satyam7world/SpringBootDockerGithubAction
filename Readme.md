# Spring Boot Kotlin + Docker + Github Actions

## About this Project
This is a BoilerPlate Project that contains a Multistaged Dockerfile for dockerizing the spring boot app, also it has a Github Actions (CI/CD) .yaml file for automatially creating docker image on cloud and pushing it to registry.

## Guide
* ### Local Build with Dockerfile

``docker build -t satyam7world/spring_boot_docker_github_action .``

* ### With GitHub Actions
>1. Have a look at [image_push.yml](https://github.com/satyam7world/SpringBootDockerGithubAction/blob/master/.github/workflows/image_push.yml) . 
>2. Create repository secrets for dockerhub login.
>3. action will run on new push. 

* ### Running the Spring Boot Rest Server (Docker).
1. ``docker run -d -p 80:8080 --restart=always satyam7world/spring_boot_docker_github_action``



### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.1/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.1/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web)


now. 
testing my webhook, that is why added this line
