# SpringBootWithActuator

This project is intended to demonstrate the use of Spring Boot Actuator with Spring Boot.

## Spring Boot Actuator
It includes a number of built-in endpoints and you can also add your own. Some of the common endpoints are :
```bash
`health` This endpoint provides basic application health information.
```
```bash
`metrics` Shows metrics information for the current application.
```
```bash
`trace` Displays trace information (by default the last 100 HTTP requests).
```
```bash
`env` Exposes properties from Spring’s ConfigurableEnvironment.
```

### Steps to run the application
* $ gradle clean build
* $ gradle bootRun
