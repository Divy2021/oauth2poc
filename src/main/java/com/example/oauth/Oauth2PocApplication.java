package com.example.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;

@SpringBootApplication(exclude = PropertyPlaceholderAutoConfiguration.class)
public class Oauth2PocApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2PocApplication.class, args);
	}

}
