package com.everis.equipo2semana4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@Import(SwaggerConfiguration.class)
public class Equipo2semana4NotificacionesApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(Equipo2semana4NotificacionesApplication.class, args);
	}
	
	 @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	         registry.addResourceHandler("swagger-ui.html")
	                  .addResourceLocations("classpath:/META-INF/resources/");
	  }

}
