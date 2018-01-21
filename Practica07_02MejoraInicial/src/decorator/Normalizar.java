package decorator;

import java.io.IOException;

import outputs.Output;

public class Normalizar extends Decorator {

	public Normalizar(Output output) {
		super(output);
	}

	@Override
	public void send(char c) throws IOException {
		if (c == '\r')
			return;
		super.send(c);
	}

}
