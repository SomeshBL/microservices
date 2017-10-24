package org.javatigers.boot.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring boot application with Spring Actuator
 * @author sk
 *
 */
@SpringBootApplication
@RestController
public class SpringBootWithActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithActuatorApplication.class, args);
	}
	
	
	@RequestMapping(value="/hello" , method = RequestMethod.GET)
	public String sayHello(){
		return "Hello from Spring Boot !!";
	}
	
}
