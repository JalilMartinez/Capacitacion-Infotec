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

import com.example.demo.dto.DireccionData;
import com.example.demo.entity.Direccion;
import com.example.demo.entity.Persona;
import com.example.demo.service.DireccionService;
import com.example.demo.service.PersonaService;

@RestController
public class DireccionController {
	@Autowired
	public DireccionService direccionService;
	@Autowired
	public PersonaService personaService;
	
	//guardar
	@PutMapping("/guardarDireccion")
	public ResponseEntity <Integer> guardarDireccion(@RequestParam("id_persona") Integer id_persona, @RequestParam("calle")String calle,@RequestParam("colonia")String colonia,@RequestParam("ciudad")String ciudad, @RequestParam("estado")String estado,@RequestParam("numero_interior")int numero_exterior, @RequestParam("numero_interior")int numero_interior,@RequestParam("codigo_postal")int codigo_postal ){
		Integer id = 0;
		try {
			Persona persona = this.personaService.obtenerPorId(id_persona);
			id = this.direccionService.guardarDireccion(calle, colonia, ciudad, estado, numero_interior, numero_exterior, codigo_postal,persona);
			System.out.print(id);
		}catch(Exception e){
			System.out.println("Error");
		}
		if(id==0) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(id,HttpStatus.OK);	
	}
	
	@PutMapping("/guardarDTODireccion")
	public ResponseEntity <Integer> guardarPersona(@RequestBody DireccionData data){
		Integer id = 0;
		try {
			id = this.direccionService.guardarDireccion(data.getCalle(), data.getColonia(), data.getCiudad(),data.getEstado(), data.getNumero_exterior(),data.getNumero_interior(),data.getCodigo_postal());
		}catch(Exception e){
			System.out.println("Error");
		}
		if(id==0) {
			return new ResponseEntity<>(id,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
	
	//buscar
	@GetMapping("/obtenerDireccion/{id}")
	public ResponseEntity<DireccionData> obtenerDireccion(@PathVariable("id")Integer id){
		Direccion direccion = this.direccionService.obtenerPorId(id);
		DireccionData data=new DireccionData(direccion);
		
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	//actualiza
	@PutMapping("/actualizaDireccion/{id}")
    public ResponseEntity<Integer> actualizaDireccion(@PathVariable("id") Integer id, @RequestBody DireccionData data) {

		try {
			Direccion direccion = this.direccionService.obtenerPorId(id);
			direccion.setCalle(data.getCalle());
			direccion.setCiudad(data.getCiudad());
			direccion.setCodigo_postal(data.getCodigo_postal());
			direccion.setColonia(data.getColonia());
			direccion.setEstado(data.getEstado());
			direccion.setNumero_exterior(data.getNumero_exterior());
			direccion.setNumero_interior(data.getNumero_interior());
			direccionService.actualizaDireccion(direccion);
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
	@GetMapping("/borrarDireccion/{id}")
	public ResponseEntity<Void> borrarDireccion(@PathVariable("id")Integer id){
        Direccion direccion = this.direccionService.obtenerPorId(id);
        this.direccionService.eliminarDireccion(direccion.getId());
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
	
}
