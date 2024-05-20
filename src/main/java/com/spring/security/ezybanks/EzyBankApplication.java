package com.spring.security.ezybanks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class EzyBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(EzyBankApplication.class, args);
	}

}
