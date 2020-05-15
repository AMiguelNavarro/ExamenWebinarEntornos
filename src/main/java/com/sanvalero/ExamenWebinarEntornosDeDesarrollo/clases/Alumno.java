package com.sanvalero.ExamenWebinarEntornosDeDesarrollo.clases;

import java.time.LocalDate;

public class Alumno {

	private String nombreAlumno;
	private String apellidos;
	private String curso;
	private String email;
	private LocalDate fechaNacimiento;
	
	
	/***** CONSTRUCTOR ******/
	public Alumno(String nombreAlumno, String apellidos, String curso) {
		this.nombreAlumno = nombreAlumno;
		this.apellidos = apellidos;
		this.curso = curso;
	}

	
	/***** GETTERS Y SETTERS ******/
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
