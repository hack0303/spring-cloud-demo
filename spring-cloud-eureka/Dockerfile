# Docker image for springboot application
# VERSION 0.0.1
# Author: hack0303

### 基础镜像，使用alpine操作系统，openjkd使用docker pull openjdk:17-ea-jdk-alpine3.12
FROM openjdk:17-ea-jdk-alpine3.12

#作者
MAINTAINER hack0303 <1097037585@qq.com>

#系统编码
ENV LANG=C.UTF-8 LC_ALL=C.UTF-8

#声明一个挂载点，容器内此路径会对应宿主机的某个文件夹
VOLUME /tmp

#应用构建成功后的jar文件被复制到镜像内，名字也改成了app.jar
ADD target/spring-cloud-eureka-0.0.0-SNAPSHOT.jar spring-cloud-eureka.jar

#启动容器时的进程
ENTRYPOINT ["java","-jar","/spring-cloud-eureka.jar"]

#暴露8080端口
EXPOSE 8761