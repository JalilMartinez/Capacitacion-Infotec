package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class DemoController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "loginForm";
	}
	@PostMapping("/login")
	public String loginForm(Model modelo,Demo usuario) {
		String nombre = "";
		String password="";
		if(usuario.getUsuario().isEmpty()) {
			nombre = "No hay usuario ni contraseña";
		}else {
			nombre=usuario.getUsuario();
			password=usuario.getUsuario2();
		}
		modelo.addAttribute("nombre",nombre);
		modelo.addAttribute("password",password);
		return "menu";
		
	}
}
