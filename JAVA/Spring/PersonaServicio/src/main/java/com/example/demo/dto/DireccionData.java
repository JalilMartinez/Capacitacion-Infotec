package com.example.demo.dto;


import com.example.demo.entity.Direccion;


public class DireccionData {
	public Integer id;
	public String calle;
	public int numero_interior;
	public int numero_exterior;
	public String colonia;
	public String ciudad;
	public int codigo_postal;
	public String estado;
	
	
	
	public DireccionData() {
		
	}
	public DireccionData(Direccion direccion) {
		this.id=direccion.getId();
		this.calle=direccion.getCalle();
		this.ciudad=direccion.getCiudad();
		this.codigo_postal=direccion.getCodigo_postal();
		this.colonia=direccion.getColonia();
		this.estado=direccion.getEstado();
		this.numero_exterior=direccion.getNumero_exterior();
		this.numero_interior=direccion.getNumero_interior();
	}
	
	
	
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
