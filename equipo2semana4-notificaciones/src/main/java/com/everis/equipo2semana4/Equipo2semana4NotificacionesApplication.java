package com.everis.equipo2semana4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Equipo2semana4NotificacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo2semana4NotificacionesApplication.class, args);
	}

}
