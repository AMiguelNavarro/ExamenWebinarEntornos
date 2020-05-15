package com.sanvalero.ExamenWebinarEntornosDeDesarrollo.clases;

public class Cuadro {
	
	private String nombreCuadro;
	private String tecnica;
	private String tama�o;
	
	/***** CONSTRUCTOR ******/
	public Cuadro(String nombreCuadro, String tecnica, String tama�o) {
		this.nombreCuadro = nombreCuadro;
		this.tecnica = tecnica;
		this.tama�o = tama�o;
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
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	
	/***** M�TODOS DE CLASE ******/
	public int sumarPuntuacion(int puntuacion) {
		return puntuacion;
	}
	
	

}
