package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Alumno;

public interface AlumnoRepository  extends JpaRepository<Alumno, Integer>{

	
//	@Query("select p from Alumno p where p.dni = :param_dni")
//	public List<Alumno> listaPorDni(@Param("param_dni") String dni);
//	
//	@Query("select p from Alumno p where p.nombre like :param_nombre")
//	public List<Alumno> listaPorNombreLike(@Param("param_nombre") String nombre);
	
	
	public List<Alumno> findByDni(String dni);
	
	public List<Alumno> findByNombreLike(String nombre);
	
}
