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
		int stock = consultaStock(inventario.getProducto().getIdproducto());
		if(inventario.getMovimiento()<0) {
			if(inventario.getMovimiento() > stock) {
				return inventarioRepository.save(inventario);
			}else{
				return null;
			}
		}
		return inventarioRepository.save(inventario);		
	}
	
	public List<Inventario> listarInventario(){
		List<Inventario> inventarios = inventarioRepository.findAll();
		return inventarios;
	}
	
	public int consultaStock(int id) {
	int stock = 0;
	List<Inventario> inventarios = inventarioRepository.findByproducto_idproducto(id);
	for (Inventario inventario : inventarios) {
		stock += inventario.getMovimiento();
	}
	return stock;
}
	
	public Inventario actualizar(Inventario inventario) {
		return inventarioRepository.save(inventario);	
	}
}
