package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaService {
	
	private PersonaRepository personaRepository;
	
	public PersonaService(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}
	
	public Persona obtenerPorId(Integer id) {
		return this.personaRepository.findById(id).get();
	
	}
	public Integer guardarPersona(String nombre, String apellidos) {
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setApellidos(apellidos);
		persona = personaRepository.save(persona);
		return persona.getId();
	}
	public void actualizaPersona(Persona persona) {
		personaRepository.save(persona);
		
	}
	public List<Persona> listaPersona(){
		return  personaRepository.findAll();
	}
	public Integer eliminarPersona(Integer id) {
		personaRepository.deleteById(id);
		return id;
	}
	
}
