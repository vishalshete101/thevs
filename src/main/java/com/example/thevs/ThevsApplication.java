package com.example.thevs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ThevsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThevsApplication.class, args);
	}

}
