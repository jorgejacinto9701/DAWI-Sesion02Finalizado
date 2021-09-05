package com.empresa.service;

import java.util.List;

import com.empresa.entity.Alumno;

public interface AlumnoService {

	public abstract List<Alumno> listaPorDNI(String dni);
	public abstract List<Alumno> listaPorNombre(String nombre);

}
