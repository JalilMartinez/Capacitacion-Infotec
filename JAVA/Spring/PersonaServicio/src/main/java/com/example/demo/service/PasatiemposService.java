package com.example.demo.service;
/*package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.Pasatiempos;
import com.example.repository.PasatiemposRepository;

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
}
*/