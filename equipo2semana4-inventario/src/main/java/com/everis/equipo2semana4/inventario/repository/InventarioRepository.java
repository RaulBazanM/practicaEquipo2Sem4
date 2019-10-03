package com.everis.equipo2semana4.inventario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.equipo2semana4.inventario.model.Inventario;



@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer>{

	public List<Inventario> findByproducto_idProducto();
	
}
