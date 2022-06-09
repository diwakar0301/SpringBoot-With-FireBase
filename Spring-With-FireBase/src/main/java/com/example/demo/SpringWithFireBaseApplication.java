package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@PropertySource("classpath:application.properties")
@ComponentScan("com.example.*")
@SpringBootApplication
public class SpringWithFireBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithFireBaseApplication.class, args);
	}

}
