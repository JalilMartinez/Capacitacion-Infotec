package com.example.demo.entity;

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
	private String apellidos;
	
	
	
	@OneToMany(mappedBy="persona")
	private Set<Pasatiempos> pasatiempos;
	
	/*@ManyToOne(fetch = FetchType.LAZY, optional =false)
	@JoinColumn(name="direccion_id") 
	private Direccion direccion_id;*/

	/*
	public Set<Pasatiempos> getPasatiempos() {
		return pasatiempos;
	}
	public void setPasatiempos(Set<Pasatiempos> pasatiempos) {
		this.pasatiempos = pasatiempos;
	}*/
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellido) {
		this.apellidos = apellido;
	}/*
	public Direccion getDireccion_id() {
		return direccion_id;
	}
	public void setDireccion_id(Direccion direccion_id) {
		this.direccion_id = direccion_id;
	}*/
	
	
	
}
