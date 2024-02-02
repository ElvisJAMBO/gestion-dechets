package com.gestiondechets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GestionDesDechetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDesDechetsApplication.class, args);
	}

}
