package Sentencias.Strategy;

import Sentencias.Sentencia;

public class AbstractSentencia implements Sentencia {
	StringBuilder texto;
	String[] line;

	public AbstractSentencia(StringBuilder texto, String[] line) {
		this.texto = texto;
		this.line = line;
	}

	@Override
	public StringBuilder ejecutar() {
		return texto;
	}
}
