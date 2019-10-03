package com.everis.equipo2semana4.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.equipo2semana4.inventario.model.Inventario;
import com.everis.equipo2semana4.inventario.repository.InventarioRepository;

@Service
public class InventarioService {
	
	@Autowired
	private InventarioRepository inventarioRepository;
	
	public Inventario insertar(Inventario inventario) {
		return inventarioRepository.save(inventario);
	}
	
	public int consultaStock(int id) {
		int stock = 0;
		List<Inventario> inventarios = inventarioRepository.findByproducto_idProducto();
		for (Inventario inventario : inventarios) {
			stock += inventario.getMovimiento();
		}
		return stock;
	}
	
	public Inventario actualizar(Inventario inventario) {
		return inventarioRepository.save(inventario);
		
	}
}
