package com.sanvalero.ExamenWebinarEntornosDeDesarrollo.clases;

public class Cuadro {
	
	private String nombreCuadro;
	private String tecnica;
	private String tamaño;
	
	/***** CONSTRUCTOR ******/
	public Cuadro(String nombreCuadro, String tecnica, String tamaño) {
		this.nombreCuadro = nombreCuadro;
		this.tecnica = tecnica;
		this.tamaño = tamaño;
	}
	
	/***** GETTERS Y SETTERS******/
	public String getNombreCuadro() {
		return nombreCuadro;
	}
	public void setNombreCuadro(String nombreCuadro) {
		this.nombreCuadro = nombreCuadro;
	}
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	
	/***** MÉTODOS DE CLASE ******/
	public int sumarPuntuacion(int puntuacion) {
		return puntuacion;
	}
	
	

}
