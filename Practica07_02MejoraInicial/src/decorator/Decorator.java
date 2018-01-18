package decorator;

import java.io.IOException;

import outputs.Output;

public class Decorator implements Output {
	private Output output;

	public Decorator(Output output) {
		this.output = output;
	}

	@Override
	public void send(char c) throws IOException {
		output.send(c);
	}

	@Override
	public void close() throws IOException {
		output.close();
	}
}
