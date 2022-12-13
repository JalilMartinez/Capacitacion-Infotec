package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.Persona;
import com.example.repository.PersonaRepository;

@Service
public class PersonaService {
	private PersonaRepository personaRepository;
	public PersonaService(PersonaRepository personaRepository){
		this.personaRepository=personaRepository;
	}
	public Persona obtenerPorId(Integer id) {
		return this.personaRepository.findById(id).get();
	}
	public Integer guardarPersona(String nombre, String apellido) {
		Persona persona= new Persona();
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		//persona.setDireccion_id(direccion_id);
		persona=personaRepository.save(persona);
		return persona.getId();
	}
}
