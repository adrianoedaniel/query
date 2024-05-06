package com.mapeamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class Avaliacaomap2Application {

	public static void main(String[] args) {
		SpringApplication.run(Avaliacaomap2Application.class, args);
	}

}
