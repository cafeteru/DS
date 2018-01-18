package outputs.filters;

import java.io.*;

import outputs.*;

public class Encryptor implements Output {

	private Output output;

	public Encryptor(Output output) {
		this.output = output;
	}

	public void send(char c) throws IOException {
		output.send((char) (Character.isLetterOrDigit(c) ? c + 1 : c));
	}

	public void close() throws IOException {
		output.close();
	}

}
