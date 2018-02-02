package com.target;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.target"})
public class EntityManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntityManagerApplication.class, args);
	}
}
