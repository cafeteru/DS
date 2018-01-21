package Campos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Campos.Strategy.Comprobador;

public class Campo {
	private String texto;
	private String etiqueta;
	private Comprobador comprobador;

	public Campo(String etiqueta, Comprobador comprobador) {
		this.etiqueta = etiqueta;
		this.comprobador = comprobador;
	}

	public void pideDato() {
		BufferedReader consola = new BufferedReader(
				new InputStreamReader(System.in));
		boolean valido = true;
		do {
			try {
				System.out.print(etiqueta + ": ");
				texto = consola.readLine();
				valido = comprobador.comprobarDato(texto);
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);
	}

	public String getString() {
		return texto;
	}
}
