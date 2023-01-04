package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DataDTO;
import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;

@RestController
public class PersonaController {
	@Autowired
	public PersonaService personaService;
	//guardar
	@PutMapping("/guardarPersona")
	public ResponseEntity <Integer> guardarPersona(@RequestParam("nombre")String nombre,@RequestParam("apellidos")String apellidos){
		Integer id = 0;
		try {
			id = this.personaService.guardarPersona(nombre, apellidos);
			System.out.print(id);
		}catch(Exception e){
			System.out.println("Error");
		}
		if(id==0) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
	
	@PutMapping("/guardarDTO")
	public ResponseEntity <Integer> guardarPersona(@RequestBody DataDTO data){
		Integer id = 0;
		try {
			id=this.personaService.guardarPersona(data.getNombre(), data.getApellidos());
		}catch(Exception e){
			System.out.println("Error");
		}
		if(id==0) {
			return new ResponseEntity<>(id,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
	//buscar
	
	@GetMapping("/obtenerPersona/{id}")
	public ResponseEntity<DataDTO> obtenerPersona(@PathVariable("id")Integer id){
		Persona persona = this.personaService.obtenerPorId(id);
		DataDTO data=new DataDTO(persona);
		
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//actualiza
	@PutMapping("/actualizaPersona/{id}")
    public ResponseEntity<Integer> actualizaPersona(@PathVariable("id") Integer id, @RequestParam("nombre")String nombre,@RequestParam("apellidos")String apellidos) {

		try {
			Persona persona = this.personaService.obtenerPorId(id);
			persona.setNombre(nombre);
			persona.setApellidos(apellidos);
			personaService.actualizaPersona(persona);
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
	@GetMapping("/borrarPersona/{id}")
	public ResponseEntity<Void> borrarPersona(@PathVariable("id")Integer id){
        Persona persona = this.personaService.obtenerPorId(id);
        this.personaService.eliminarPersona(persona.getId());
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
		 /*
	//Crear PDF
	@GetMapping("/create")
	public String crear(Model model) {
		
	}*/
	
	

}
