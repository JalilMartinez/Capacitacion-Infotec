package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Pasatiempos;
import com.example.demo.repository.PasatiemposRepository;
import com.example.demo.entity.Persona;
@Service
public class PasatiemposService {
	private PasatiemposRepository pasatiemposRepository;
	
	public PasatiemposService(PasatiemposRepository pasatiemposRepository) {
		this.pasatiemposRepository=pasatiemposRepository;
	}
	public Pasatiempos obtenerPorId(Integer id) {
		return this.pasatiemposRepository.findById(id).get();
	}
	public Integer guardarPasatiempos(String nombre,String pasatiempo) {
		Pasatiempos pasatiempos=new Pasatiempos();
		pasatiempos.setNombre(nombre);
		pasatiempos.setPasatiempo(pasatiempo);
		pasatiempos=pasatiemposRepository.save(pasatiempos);
		return pasatiempos.getId();
	}
	public Integer guardarPasatiempos(String nombre,String pasatiempo, Persona persona) {
		Pasatiempos pasatiempos=new Pasatiempos();
		pasatiempos.setPersona(persona);
		pasatiempos.setNombre(nombre);
		pasatiempos.setPasatiempo(pasatiempo);
		pasatiempos=pasatiemposRepository.save(pasatiempos);
		return pasatiempos.getId();
	}
	public void actualizaPasatiempos(Pasatiempos pasatiempo) {
		pasatiemposRepository.save(pasatiempo);
		
	}
	public Integer eliminarPasatiempos(Integer id) {
		pasatiemposRepository.deleteById(id);
		return id;
	}
}
