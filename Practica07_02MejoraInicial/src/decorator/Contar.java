package decorator;

import java.io.IOException;

import outputs.Output;

public class Contar extends Decorator {
	private int caracteres;

	public int getCaracteres() {
		return caracteres;
	}

	public Contar(Output output) {
		super(output);
		caracteres = 0;
	}

	@Override
	public void send(char c) throws IOException {
		super.send(c);
		caracteres++;
	}

	@Override
	public void close() throws IOException {
		super.close();
		System.out.println("Se han enviado" + caracteres + " caracteres");
	}

}
