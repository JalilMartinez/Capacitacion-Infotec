package com.example.demo.entity;
/*package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="pasatiempos", schema="public", uniqueConstraints= {@UniqueConstraint (columnNames = {"nombre"})})
public class Pasatiempos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String pasatiempo;
	
	@ManyToOne(fetch = FetchType.LAZY, optional =false)
	@JoinColumn(name="id_persona")
	private Persona id_persona; 
	
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
	public Persona getId_persona() {
		return id_persona;
	}
	public void setId_persona(Persona id_persona) {
		this.id_persona = id_persona;
	}
}
*/