package com.everis.equipo2semana4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Equipo2semana4ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo2semana4ConfigServerApplication.class, args);
	}

}
