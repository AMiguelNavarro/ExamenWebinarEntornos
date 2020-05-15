package com.sanvalero.ExamenWebinarEntornosDeDesarrollo.clases;

public class Usuario {
	
	private String email;
	private String contraseña;
	
	/***** CONSTRUCTOR ******/
	public Usuario(String email, String contraseña) {
		super();
		this.email = email;
		this.contraseña = contraseña;
	}
	
	/***** GETTERS Y SETTERS ******/
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
	
	/***** MÉTODOS DE CLASE ******/
	
	

}
