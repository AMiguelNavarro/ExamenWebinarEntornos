package com.sanvalero.ExamenWebinarEntornosDeDesarrollo.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sanvalero.ExamenWebinarEntornosDeDesarrollo.clases.Concurso;
import com.sanvalero.ExamenWebinarEntornosDeDesarrollo.clases.Cuadro;
import com.sanvalero.ExamenWebinarEntornosDeDesarrollo.clases.Usuario;

public class PuntuarTest {
	
	@Test
	public void puntuar() {
		
		Concurso concurso = new Concurso();		
		Usuario usuario1 = new Usuario("usuario1@gmail.com", "usuario1");
		Cuadro cuadro1 = new Cuadro("cuadro test", "acrílica", "20 x 20");
		
		assertEquals(10, concurso.puntuar(usuario1, cuadro1, 10));

	}

}
