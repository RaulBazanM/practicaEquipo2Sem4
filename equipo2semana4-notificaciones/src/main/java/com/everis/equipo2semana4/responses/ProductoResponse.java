package com.everis.equipo2semana4.responses;

import java.util.List;

import com.everis.equipo2semana4.model.Producto;

public class ProductoResponse {
	
	private String correo;
	private List<Producto> productos;
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	

}
