package com.sanvalero.ExamenWebinarEntornosDeDesarrollo.clases;

public class Colegio {
	
	private String nombreColegio;
	private String direccion;
	private String email;
	private String contrase�a;
	private String personaContacto;
	
	/***** CONSTRUCTOR ******/
	public Colegio(String nombreColegio, String contrase�a) {
		this.nombreColegio = nombreColegio;
		this.contrase�a = contrase�a;
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
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public String getPersonaContacto() {
		return personaContacto;
	}
	public void setPersonaContacto(String personaContacto) {
		this.personaContacto = personaContacto;
	}
	
	/***** M�TODOS DE CLASE ******/
	
	

}
