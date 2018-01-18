package decorator;

import java.io.IOException;

import outputs.Output;

public class SinEspacios extends Encriptar {

	private char lastChar;

	public SinEspacios(Output output) {
		super(output);
	}

	@Override
	public void send(char c) throws IOException {
		if (c == ' ' && lastChar == ' ')
			return;
		super.send(c);
		lastChar = c;
	}
}
