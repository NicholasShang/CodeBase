package com.nick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CodeBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeBaseApplication.class, args);
	}
}
