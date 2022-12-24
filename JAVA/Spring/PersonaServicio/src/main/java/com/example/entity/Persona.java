package com.example.entity;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="persona", schema = "public") 
public class Persona {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String apellido;
	
	
	
	@OneToMany(mappedBy="persona", cascade = CascadeType.ALL)
	private Set<Pasatiempos> pasatiempo = new HashSet<>();
	
	@ManyToOne(fetch = FetchType.LAZY, optional =false)
	@JoinColumn(name="direccion_id") 
	private Direccion direccion_id;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Direccion getDireccion_id() {
		return direccion_id;
	}
	public void setDireccion_id(Direccion direccion_id) {
		this.direccion_id = direccion_id;
	}
	
	
	
}
