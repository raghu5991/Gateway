package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.company")
public class ServiceDeveloperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDeveloperApplication.class, args);
	}

}
