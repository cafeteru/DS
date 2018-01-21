package Componentes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fichero {
	private List<String[]> instrucciones = new ArrayList<String[]>();

	public Fichero(String nombre) throws IOException {
		cargarSentencias(nombre);
	}

	private void cargarSentencias(String nombre) throws IOException {
		BufferedReader fichero = new BufferedReader(new FileReader(nombre));
		String linea;
		while ((linea = fichero.readLine()) != null)
			cargaInstruccion(linea);
		fichero.close();
	}

	private void cargaInstruccion(String linea) {
		if (linea.trim().length() == 0)
			return;
		String[] palabras = linea.split(" ");
		instrucciones.add(palabras);
	}

	public List<String[]> getInstrucciones() {
		return instrucciones;
	}
}
