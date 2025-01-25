package com.minijira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.minijira.domain")
public class MiniJira {

	public static void main(String[] args) {
		SpringApplication.run(MiniJira.class, args);
	}

}
