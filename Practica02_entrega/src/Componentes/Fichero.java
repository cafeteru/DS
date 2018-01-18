package Componentes;

import java.io.*;
import java.util.*;

public class Fichero {
	private List<String[]> instrucciones = new ArrayList<String[]>();

	public Fichero(String nombre) throws IOException {
		cargarSentencias(nombre);
	}

	private void cargarSentencias(String nombre) throws IOException {
		BufferedReader fichero = new BufferedReader(new FileReader(nombre));
		String linea;
		while ((linea = fichero.readLine()) != null)
			cargaInstrucción(linea);
		fichero.close();
	}

	private void cargaInstrucción(String linea) {
		if (linea.trim().length() == 0)
			return;
		String[] palabras = linea.split(" ");
		instrucciones.add(palabras);
	}

	public List<String[]> getInstrucciones() {
		return instrucciones;
	}
}
