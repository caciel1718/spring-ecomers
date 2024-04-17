package com.curso.ecomers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringEcomersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEcomersApplication.class, args);
	}

}
