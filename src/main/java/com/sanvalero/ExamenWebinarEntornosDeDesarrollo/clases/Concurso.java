package com.sanvalero.ExamenWebinarEntornosDeDesarrollo.clases;

import java.util.ArrayList;
import java.util.List;

public class Concurso {
	
	List<Usuario> listaUsuarios;
	
	public Concurso() {
		listaUsuarios = new ArrayList<>();
	}
	
	public int puntuar(Usuario usuario, Cuadro cuadro, int puntuacion) {
		if(!listaUsuarios.contains(usuario)) {
			System.out.println("Él usuario no existe, debe registrarse antes para puntuar");
		}
		
		if ((puntuacion < 0) || (puntuacion > 5)) {
			System.out.println("La puntuación tiene que ser entre 0 y 5");
		}
		
		
		return cuadro.sumarPuntuacion(puntuacion);
	}

}
