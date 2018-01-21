package Sentencias.Strategy;

public class Insertar extends AbstractSentencia {

	public Insertar(StringBuilder texto, String[] line) {
		super(texto, line);
		// TODO Auto-generated constructor stub
	}

	@Override
	public StringBuilder ejecutar() {
		for (int i = 1; i < line.length; i++) {
			texto.append(line[i] + " ");
		}
		return texto;
	}

}
