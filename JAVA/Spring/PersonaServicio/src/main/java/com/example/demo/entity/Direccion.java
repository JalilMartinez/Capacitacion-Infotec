package com.example.demo.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="direccion",schema="public")
public class Direccion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String calle;
	private int numero_interior;
	private int numero_exterior;
	private String colonia;
	private String ciudad;
	private int codigo_postal;
	private String estado;
	/*
	@OneToMany(mappedBy="direccion", cascade = CascadeType.ALL)
	private Set<Persona> persona = new HashSet<>();*/
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero_interior() {
		return numero_interior;
	}
	public void setNumero_interior(int numero_interior) {
		this.numero_interior = numero_interior;
	}
	public int getNumero_exterior() {
		return numero_exterior;
	}
	public void setNumero_exterior(int numero_exterior) {
		this.numero_exterior = numero_exterior;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
