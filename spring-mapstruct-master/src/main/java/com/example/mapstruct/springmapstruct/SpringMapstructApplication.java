package com.example.mapstruct.springmapstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.mapstruct.springmapstruct")
public class SpringMapstructApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMapstructApplication.class, args);
	}

}
