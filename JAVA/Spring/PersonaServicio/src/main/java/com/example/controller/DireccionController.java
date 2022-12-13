package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.DireccionData;
import com.example.entity.Direccion;
import com.example.service.DireccionService;

@RestController
public class DireccionController {
	@Autowired
	public DireccionService direccionService;
	
	//guardar
	@PutMapping("/guardarDireccion")
	public ResponseEntity <Integer> guardarDireccion(@RequestParam("calle")String calle,@RequestParam("colonia")String colonia,@RequestParam("ciudad")String ciudad, @RequestParam("estado")String estado,@RequestParam("numero_interior")int numero_exterior, @RequestParam("numero_interior")int numero_interior,@RequestParam("codigo_postal")int codigo_postal ){
		
		Integer id = 0;
		try {
			id = this.direccionService.guardarDireccion(calle, colonia,ciudad,estado, numero_interior,numero_exterior,codigo_postal);
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
	//borrar
	 @DeleteMapping("/delete/{id}")
	 @ResponseBody
	 public ResponseEntity<Void> deleteItem(@PathVariable("id")Integer id){
        Direccion direccion = this.direccionService.obtenerPorId(id);
        this.direccionService.eliminarDireccion(direccion.getId());
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
