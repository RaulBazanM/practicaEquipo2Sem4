package com.everis.equipo2semana4productos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo2semana4productos.model.Producto;
import com.everis.equipo2semana4productos.service.ProductosService;

@RestController
@RequestMapping("/")
public class ProductoController {

	@Autowired
	private ProductosService productoService;
	
	@PostMapping("alta/producto")
	@ResponseBody
	public Producto insertarProducto(@RequestBody Producto producto) {
		return productoService.insertarProducto(producto);
	}
	
	@GetMapping("consultar/productos")
	public List<Producto> listarProductos(){
		return productoService.listarProductos();
	}
	
	@GetMapping("")
	public String prueba() {
		return productoService.prueba();
	}
	
}
