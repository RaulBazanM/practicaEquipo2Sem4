package com.everis.equipo2semana4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo2semana4.model.Producto;
import com.everis.equipo2semana4.responses.NotificacionesResponse;
import com.everis.equipo2semana4.responses.ProductoResponse;
import com.everis.equipo2semana4.service.CorreoService;



@RestController
@RequestMapping("/notificacion")
public class NotificacionesController {
	@Autowired
	private CorreoService correo;
	
	@Autowired
	private Environment environment;
	
	@PostMapping("/")
	public NotificacionesResponse enviarCorreo(@RequestBody ProductoResponse productoResponse) {
		NotificacionesResponse response = new NotificacionesResponse();
		String destinatario = productoResponse.getCorreo();
		List<Producto> productos = productoResponse.getProductos();
		String infoProducto = "";
		for (int i=0; i<productos.size(); i++) {
			infoProducto = infoProducto +"<h1>Nombre: "+productos.get(i).getNombre()+"</h1></br>"
					+ "<h2>Precio: "+productos.get(i).getPrecio()+"</h2></br>"
					+ "<h2>Descuento (%): "+productos.get(i).getDescuento()+"</h2></br>"
					+ "<h3>Descripcion: </h3>"+productos.get(i).getDescripcion()+"</br>"
					+ "<img src=\""+productos.get(i).getUrl()+"\">";
		}
		boolean exitoCorreo = correo.enviarCorreoHTML(destinatario, "Catálogo", infoProducto);
		if(exitoCorreo) {
			response.setSuccesful(true);
			response.setMensaje("Correo enviado a " + destinatario);
			return response;
		}
		else {
			response.setSuccesful(false);
			response.setMensaje("No fue posible enviar correo");
			return response;
		}
	}
	
	@GetMapping("/")
	public ProductoResponse obtenProductos(){
		ProductoResponse productoResponse = new ProductoResponse();
		List<Producto> listaDePrueba = new ArrayList<>();
		Producto producto1 = new Producto();
		producto1.setNombre("Xbox");
		producto1.setPrecio(1200.00);
		producto1.setDescripcion("<p>Nuevo y blanco</p>");
		producto1.setDescuento(50.0);
		producto1.setUrl("https://img.icons8.com/plasticine/2x/google-logo.png");
		listaDePrueba.add(producto1);
		Producto producto2 = new Producto();
		producto2.setNombre("Play");
		producto2.setPrecio(1400.00);
		producto2.setDescripcion("<p>Viejo y negro</p>");
		producto2.setDescuento(40.0);
		producto2.setUrl("https://img.icons8.com/plasticine/2x/google-logo.png");
		listaDePrueba.add(producto2);
		productoResponse.setProductos(listaDePrueba);
		productoResponse.setCorreo("bazan.0720@gmail.com");		
		return productoResponse;
	}
	
}
