package outputs.filters;

import java.io.IOException;

import outputs.Output;

public class SpacesFilter implements Output {

	private Output output;
	private char lastChar = 0;

	public SpacesFilter(Output output) {
		this.output = output;
	}

	public void send(char c) throws IOException {
		if (c == ' ' && lastChar == ' ')
			return;

		output.send(c);
		lastChar = c;
	}

	public void close() throws IOException {
		output.close();
	}

}
