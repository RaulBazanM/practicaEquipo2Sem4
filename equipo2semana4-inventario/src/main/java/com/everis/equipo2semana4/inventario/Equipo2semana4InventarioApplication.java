package com.everis.equipo2semana4.inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SwaggerConfiguration.class)
public class Equipo2semana4InventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo2semana4InventarioApplication.class, args);
	}

}
