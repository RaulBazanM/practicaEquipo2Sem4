package com.everis.equipo2semana4productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.equipo2semana4productos.model.Producto;

@Repository
public interface ProductosRepository extends JpaRepository<Producto, Integer> {

}
