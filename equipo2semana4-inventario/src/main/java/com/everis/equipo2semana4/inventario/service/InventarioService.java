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
	
	public Inventario insertarPedido(Inventario inventario) {
		return inventarioRepository.save(inventario);
	}
	
	public List<Inventario> listar(){
		return inventarioRepository.findAll();
	}
	
	
	
}
