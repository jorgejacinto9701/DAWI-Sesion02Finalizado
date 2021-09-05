package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empresa.entity.Alumno;
import com.empresa.service.AlumnoService;

@Controller
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;
	
	@RequestMapping("/verConsultaAlumnoPorNombre")
	public String verConsultaPorNombre() {
		return "consultaAlumnoPorNombre";
	}
	
	@RequestMapping("/verConsultaAlumnoPorDNI")
	public String verConsultaPorDNI() {
		return "consultaAlumnoPorDNI";
	}
	
	@RequestMapping("consultaPorDni")
	@ResponseBody
	public List<Alumno> porDni(String dni){
		return alumnoService.listaPorDNI(dni);
	}
	
	@RequestMapping("consultaPorNombre")
	@ResponseBody
	public List<Alumno> porNombre(String nombre){
		return alumnoService.listaPorNombre("%"+ nombre + "%");
	}
	

}
