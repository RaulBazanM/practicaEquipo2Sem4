package com.everis.equipo2semana4.inventario.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo2semana4.inventario.model.Inventario;
import com.everis.equipo2semana4.inventario.response.InventarioResponse;
import com.everis.equipo2semana4.inventario.service.InventarioService;

@RestController
@RequestMapping("/prueba")
@ResponseBody
public class InventarioController {

	@Autowired
	private InventarioService inventarioService;
	
	@GetMapping
	public List<Inventario> listarInventario(){
		return inventarioService.listarInventario();
	}
	
	 @PostMapping("/")
	 @ResponseBody
	 public InventarioResponse nuevoInventario(@RequestBody Inventario inventario) {
		 InventarioResponse inventarioResponse = new InventarioResponse();
		 inventario.setFecha(new Date());
		 Inventario inventarioR = inventarioService.insertar(inventario);
		 try {
			 inventarioResponse.setInventario(inventarioR);
			 inventarioResponse.setSuccessful(true);
			 inventarioResponse.setMessage("funciona xD");			 
		 }catch(Exception e) {
			 inventarioResponse.setSuccessful(false);
			 inventarioResponse.setMessage(e.getMessage());
		 }
		 return inventarioResponse;
	 }	
}