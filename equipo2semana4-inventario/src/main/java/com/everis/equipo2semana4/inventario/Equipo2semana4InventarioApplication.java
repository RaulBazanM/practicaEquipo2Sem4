package com.everis.equipo2semana4.inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Import(SwaggerConfiguration.class)

public class Equipo2semana4InventarioApplication implements WebMvcConfigurer{

	
	public static void main(String[] args) {
		SpringApplication.run(Equipo2semana4InventarioApplication.class, args);
	}

	  @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	         registry.addResourceHandler("swagger-ui.html")
	                  .addResourceLocations("classpath:/META-INF/resources/");
	  }
}
