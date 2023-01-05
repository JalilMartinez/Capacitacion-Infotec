package com.example.demo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Direccion;
import com.example.demo.repository.DireccionRepository;
import com.example.demo.entity.Persona;

@Service
public class DireccionService {
	private DireccionRepository direccionRepository;
	
	public DireccionService(DireccionRepository direccionRepository) {
		this.direccionRepository=direccionRepository;
	}
	
	public Direccion obtenerPorId(Integer id) {
		return this.direccionRepository.findById(id).get();
	}
	
	public Integer guardarDireccion(String calle, String colonia, String ciudad, String estado, int numero_interior, int numero_exterior, int codigo_postal) {
		Direccion direccion=new Direccion();
		direccion.setCalle(calle);
		direccion.setCiudad(ciudad);
		direccion.setCodigo_postal(codigo_postal);
		direccion.setColonia(colonia);
		direccion.setEstado(estado);
		direccion.setNumero_exterior(numero_exterior);
		direccion.setNumero_interior(numero_interior);
		direccion=direccionRepository.save(direccion);
		return direccion.getId();
		
	}
	public Integer guardarDireccion(String calle, String colonia, String ciudad, String estado, int numero_interior, int numero_exterior, int codigo_postal, Persona persona) {
		Direccion direccion=new Direccion();
		direccion.setCalle(calle);
		direccion.setCiudad(ciudad);
		direccion.setCodigo_postal(codigo_postal);
		direccion.setColonia(colonia);
		direccion.setEstado(estado);
		direccion.setNumero_exterior(numero_exterior);
		direccion.setNumero_interior(numero_interior);
		direccion.setPersona(persona);
		direccion=direccionRepository.save(direccion);
		return direccion.getId();
		
	}
	public void actualizaDireccion(Direccion direccion) {
		direccionRepository.save(direccion);
		
	}
	public List<Direccion> listaDireccion(){
		return  direccionRepository.findAll();
	}
	public Integer eliminarDireccion(Integer id) {
		
		direccionRepository.deleteById(id);
		return id;
	}
}
