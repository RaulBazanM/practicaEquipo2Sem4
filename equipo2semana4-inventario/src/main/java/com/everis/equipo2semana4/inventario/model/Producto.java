package com.everis.equipo2semana4.inventario.model;
// Generated 3/10/2019 12:09:30 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
<<<<<<< Updated upstream

import com.fasterxml.jackson.annotation.JsonIgnore;

=======
import static javax.persistence.GenerationType.IDENTITY;
>>>>>>> Stashed changes
/**
 * Producto generated by hbm2java
 */
@Entity
@Table(name = "producto", catalog = "semana4")
public class Producto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idproducto;
	private String nombre;
	private String descripcion;
	private String url;
	private Double precio;
	private Double descuento;
	public Producto() {
	}

	public Producto(int idproducto) {
		this.idproducto = idproducto;
	}

	

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idproducto", unique = true, nullable = false)
	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	@Column(name = "nombre", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "url", length = 45)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "precio", precision = 22, scale = 0)
	public Double getPrecio() {
		return this.precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Column(name = "descuento", precision = 22, scale = 0)
	public Double getDescuento() {
		return this.descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	

}
