package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.annotations.SwaggerDefinition;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.company")
@EnableSwagger2
public class ServiceHrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHrApplication.class, args);
	}

}
