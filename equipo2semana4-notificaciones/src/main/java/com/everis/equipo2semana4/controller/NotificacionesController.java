package com.everis.equipo2semana4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
	
	@PostMapping()
	public NotificacionesResponse enviarCorreo(@RequestBody ProductoResponse productoResponse) {
//		List<String> nombreProducto = new ArrayList<String>();
//		List<String> precioProducto = new ArrayList<String>();
//		List<String> descripcionProducto = new ArrayList<String>();
		String destinatario = productoResponse.getCorreo();
		List<Producto> productos = productoResponse.getProductos();
		String infoProducto = "";
		for (int i=0; i<(productos.size()-1); i++) {
			infoProducto = infoProducto +"<h1>Nombre: "+productos.get(i).getNombre()+"</h1></br>"
					+ "<h2>Precio: "+productos.get(i).getPrecio()+"</h2></br>"
					+ "<h2>Descuento: "+productos.get(i).getDescuento()+"</h2></br>"
					+ "<h3>Descripcion: </h3>"+productos.get(i).getDescripcion();
		}
		
	}
	
}
