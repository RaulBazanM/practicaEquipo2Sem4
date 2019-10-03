package com.everis.equipo2semana4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Equipo2semana4EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo2semana4EurekaServerApplication.class, args);
	}

}
