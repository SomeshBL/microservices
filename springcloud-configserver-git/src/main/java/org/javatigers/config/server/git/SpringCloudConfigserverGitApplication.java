package org.javatigers.config.server.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Config server with git
 * @author sk
 *
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigserverGitApplication.class, args);
	}
}
