package Sentencias.Strategy;

public class Borrar extends AbstractSentencia {

	public Borrar(StringBuilder texto, String[] line) {
		super(texto, line);
	}

	@Override
	public StringBuilder ejecutar() {
		int indexOfLastWord = texto.toString().trim().lastIndexOf(" ");
		if (indexOfLastWord == -1)
			texto = new StringBuilder("");
		else
			texto.setLength(indexOfLastWord + 1);
		return texto;
	}

}
