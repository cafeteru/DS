package decorator;

import java.io.IOException;

import outputs.Output;

public class EncriptarDos extends Encriptar {
	Output output2;

	public EncriptarDos(Output output, Output output2) {
		super(output);
		this.output2 = new Encriptar(output2); // Composite
	}

	@Override
	public void send(char c) throws IOException {
		super.send(c);
		output2.send(c);
	}

	@Override
	public void close() throws IOException {
		super.close();
		output2.close();
	}

}
