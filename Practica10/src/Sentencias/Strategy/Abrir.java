package Sentencias.Strategy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Abrir extends AbstractSentencia {

	public Abrir(StringBuilder texto, String[] line) {
		super(texto, line);
	}

	@Override
	public StringBuilder ejecutar() {
		try {
			texto = readFile(line[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return texto;
	}

	StringBuilder readFile(String filename) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(filename));
		String line;
		StringBuilder result = new StringBuilder();
		while ((line = input.readLine()) != null) {
			result.append(line);
		}
		input.close();
		return result;
	}
}
