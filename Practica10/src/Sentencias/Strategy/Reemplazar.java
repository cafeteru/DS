package Sentencias.Strategy;

import java.util.regex.Pattern;

public class Reemplazar extends AbstractSentencia {

	public Reemplazar(StringBuilder texto, String[] line) {
		super(texto, line);
	}

	@Override
	public StringBuilder ejecutar() {
		return new StringBuilder(
				texto.toString().replaceAll(Pattern.quote(line[1]), line[2]));

	}

}
