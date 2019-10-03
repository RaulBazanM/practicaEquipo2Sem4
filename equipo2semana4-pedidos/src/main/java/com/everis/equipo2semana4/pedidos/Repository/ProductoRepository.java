package com.everis.equipo2semana4.pedidos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.equipo2semana4.pedidos.model.Pedido;

@Repository
public interface ProductoRepository extends JpaRepository <Pedido,Integer>{

}
