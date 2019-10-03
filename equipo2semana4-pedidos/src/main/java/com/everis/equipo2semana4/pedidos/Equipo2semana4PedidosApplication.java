package com.everis.equipo2semana4.pedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Equipo2semana4PedidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo2semana4PedidosApplication.class, args);
	}

}
