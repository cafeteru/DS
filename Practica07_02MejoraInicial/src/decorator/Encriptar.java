package decorator;

import java.io.IOException;

import outputs.Output;

public class Encriptar extends Decorator {

	public Encriptar(Output output) {
		super(output);
	}

	@Override
	public void send(char c) throws IOException {
		super.send(encriptar(c));
	}

	public char encriptar(char c) {
		if (Character.isDigit(c) || Character.isLetter(c))
			return (char) ((int) c + 1);
		return c;
	}
}
