package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class JpAbyUsingCrudRepositoryApplication {

	public static void main(String[] args) {
		System.out.println("Done");
		SpringApplication.run(JpAbyUsingCrudRepositoryApplication.class, args);
	}

}
