# MicroServices
Microservices Code Examples

This repo is intended to quick start with Microservices using `Spring Cloud` and `Spring Boot`

## Table of Contents

   * [Spring Actuator](#spring-actuator)
   * [Config Server](#config-server) 


    
## Spring Actuator

Actuator endpoints allow you to monitor and interact with your application. Spring Boot includes a number of built-in endpoints and you can also add your own. For example the health endpoint provides basic application health information. In this demo, Actuator endpoint /health can be accessed over url http://localhost:18080/health
    
## Config Server

The configuration service is a vital component of any microservices architecture. Based on the twelve-factor app methodology, configurations for your microservice applications should be stored in the environment and not in the project. 
The properties can be accessed using {application_name}/{profile}/{label}. For example : http://localhost:8888/app1/default 
    
    
