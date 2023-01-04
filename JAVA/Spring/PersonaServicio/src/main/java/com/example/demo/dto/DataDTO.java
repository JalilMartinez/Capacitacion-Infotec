package com.example.demo.dto;

import com.example.demo.entity.Persona;

public class DataDTO {
	public DataDTO() {
		
	}
	public DataDTO(Persona persona) {
		this.id=persona.getId();
		this.nombre=persona.getNombre();
		this.apellidos=persona.getApellidos();
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
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String nombre;
	public String apellidos;
	public Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
