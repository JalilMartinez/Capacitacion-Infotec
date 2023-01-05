package com.example.demo.controller;


import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.dto.PasatiemposData;
import com.example.demo.entity.Pasatiempos;
import com.example.demo.service.PasatiemposService;
import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;

@Controller
public class PasatiempoController {

	@Autowired
	public PasatiemposService pasatiemposService;
	@Autowired
	public PersonaService personaService;
	
	
	
	//guardar
	@PutMapping("/guardarPasatiempos")
	public ResponseEntity <Integer> guardarPasatiempos(/*@RequestBody Pasatiempos pasatiempos*/ @RequestParam("id_persona") Integer id_persona, @RequestParam("nombre")String nombre,@RequestParam("pasatiempos")String pasatiempos){
		Integer id = 0;
		try {
			Persona persona = this.personaService.obtenerPorId(id_persona);
			id = this.pasatiemposService.guardarPasatiempos(nombre, pasatiempos, persona);
			System.out.print(id);
		}catch(Exception e){
			System.out.println("Error");
		}
		if(id==0) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(id,HttpStatus.OK);	
	}
	
	@PutMapping("/guardarDTOPasatiempo")
	public ResponseEntity <Integer> guardarPersona(@RequestBody PasatiemposData data){
		Integer id = 0;
		try {
			id = this.pasatiemposService.guardarPasatiempos(data.getNombre(), data.getPasatiempo());
		}catch(Exception e){
			System.out.println("Error");
		}
		if(id==0) {
			return new ResponseEntity<>(id,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
	
	//buscar
	@GetMapping("/obtenerPasatiempo/{id}")
	public ResponseEntity<PasatiemposData> obtenerPersona(@PathVariable("id")Integer id){
		Pasatiempos pasatiempo = this.pasatiemposService.obtenerPorId(id);
		PasatiemposData data=new PasatiemposData(pasatiempo);
		
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@GetMapping("/listaPasatiempo")
    public ResponseEntity<List<Pasatiempos>> listaPersona(){
        List<Pasatiempos> pasatiempo = pasatiemposService.listaPasatiempos();
        return new ResponseEntity<List<Pasatiempos>>(pasatiempo, HttpStatus.OK);
    }
	
	
	//actualiza
	@PutMapping("/actualizaPasatiempo/{id}")
    public ResponseEntity<Integer> actualizaPasatiempo(@PathVariable("id") Integer id, @RequestParam("nombre")String nombre,@RequestParam("pasatiempos")String pasatiempos) {

		try {
			Pasatiempos pasatiempo = this.pasatiemposService.obtenerPorId(id);
			pasatiempo.setNombre(nombre);
			pasatiempo.setPasatiempo(pasatiempos);
			pasatiemposService.actualizaPasatiempos(pasatiempo);
			System.out.print(id);
		}catch(Exception e){
			System.out.println("Error");
		}
		if(id==0) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(id,HttpStatus.OK);
		   
    }
	

	//borrar
	@GetMapping("/borrarPasatiempos/{id}")
	public ResponseEntity<Void> borrarPasatiempos(@PathVariable("id")Integer id){
        Pasatiempos pasatiempo = this.pasatiemposService.obtenerPorId(id);
        this.pasatiemposService.eliminarPasatiempos(pasatiempo.getId());
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
		
}
