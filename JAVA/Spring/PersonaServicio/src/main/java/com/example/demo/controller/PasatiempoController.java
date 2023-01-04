package com.example.demo.controller;
/*package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.PasatiemposData;
import com.example.entity.Pasatiempos;
import com.example.service.PasatiemposService;



@RestController
public class PasatiempoController {

	@Autowired
	public PasatiemposService pasatiemposService;
	
	//guardar
	@PutMapping("/guardarPasatiempo")
	public ResponseEntity <Integer> guardarPasatiempos(@RequestParam("nombre")String nombre,@RequestParam("pasatiempo")String pasatiempo){
		Integer id = 0;
		try {
			id = this.pasatiemposService.guardarPasatiempos(nombre, pasatiempo);
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
		
}*/
