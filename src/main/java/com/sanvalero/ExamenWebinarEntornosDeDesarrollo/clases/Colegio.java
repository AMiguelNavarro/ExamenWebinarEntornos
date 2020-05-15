package com.sanvalero.ExamenWebinarEntornosDeDesarrollo.clases;

public class Colegio {
	
	private String nombreColegio;
	private String direccion;
	private String email;
	private String contraseña;
	private String personaContacto;
	
	/***** CONSTRUCTOR ******/
	public Colegio(String nombreColegio, String contraseña) {
		this.nombreColegio = nombreColegio;
		this.contraseña = contraseña;
	}
	
	
	/***** GETTERS Y SETTERS ******/
	public String getNombreColegio() {
		return nombreColegio;
	}
	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getPersonaContacto() {
		return personaContacto;
	}
	public void setPersonaContacto(String personaContacto) {
		this.personaContacto = personaContacto;
	}
	
	/***** MÉTODOS DE CLASE ******/
	
	

}
