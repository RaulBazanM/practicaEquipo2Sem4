package com.everis.equipo2semana4.inventario.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("pedidos")
public class Properties {
	
	private int descuento1;
	private int descuento2;
	private int descuento3;
	private int descuento4;
	public int getDescuento1() {
		return descuento1;
	}
	public void setDescuento1(int descuento1) {
		this.descuento1 = descuento1;
	}
	public int getDescuento2() {
		return descuento2;
	}
	public void setDescuento2(int descuento2) {
		this.descuento2 = descuento2;
	}
	public int getDescuento3() {
		return descuento3;
	}
	public void setDescuento3(int descuento3) {
		this.descuento3 = descuento3;
	}
	public int getDescuento4() {
		return descuento4;
	}
	public void setDescuento4(int descuento4) {
		this.descuento4 = descuento4;
	}
	
	
}
