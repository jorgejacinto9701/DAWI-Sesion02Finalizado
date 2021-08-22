package com.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlumnoController {


	@RequestMapping("/verConsultaAlumnoPorNombre")
	public String verConsultaPorNombre() {
		return "consultaAlumnoPorNombre";
	}
	
	@RequestMapping("/verConsultaAlumnoPorDNI")
	public String verConsultaPorDNI() {
		return "consultaAlumnoPorDNI";
	}

}
