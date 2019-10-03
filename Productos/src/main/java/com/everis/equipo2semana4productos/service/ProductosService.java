package com.everis.equipo2semana4productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.equipo2semana4productos.model.Producto;
import com.everis.equipo2semana4productos.repository.ProductosRepository;

@Service
public class ProductosService {
	
	@
	
	@Autowired
	private ProductosRepository productosRepository;
	
	public List<Producto> listarProductos (){
		return productosRepository.findAll();
	}
		
	public Producto insertarProducto (Producto producto) {
		double precio = producto.getPrecio();
		if(precio >= 0 && precio < 1001) {
			
		}else if(precio >= 1001 && precio < 5001) {
			
		}else if(precio >= 5001){
			
		}
		return productosRepository.save(producto);
	}

}
