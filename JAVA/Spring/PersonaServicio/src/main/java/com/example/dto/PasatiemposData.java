package com.example.dto;

import com.example.entity.Pasatiempos;

	
public class PasatiemposData {
	
	public Integer id;
	public String nombre;
	public String pasatiempo;
	
	public PasatiemposData() {
		
	}
	public PasatiemposData(Pasatiempos pasatiempos) {
		this.id=pasatiempos.getId();
		this.nombre=pasatiempos.getNombre();
		this.pasatiempo=pasatiempos.getPasatiempo();
		
	}
	
	
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
	public String getPasatiempo() {
		return pasatiempo;
	}
	public void setPasatiempo(String pasatiempo) {
		this.pasatiempo = pasatiempo;
	}
}
