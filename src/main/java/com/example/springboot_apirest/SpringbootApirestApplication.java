package com.example.springboot_apirest;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringbootApirestApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(
        SpringApplication.class);
    	app.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
    	app.run(args);
		//SpringApplication.run(SpringbootApirestApplication.class, args);
	}

	@Bean
	WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@SuppressWarnings("null")
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:5501","http://localhost",
				"http://localhost:8080").allowedMethods("*").allowedHeaders("*");
			}
		};
	}

}

