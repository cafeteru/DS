package outputs.filters;

import java.io.*;

import outputs.*;

public class LinesFilter implements Output {

	private Output output;

	public LinesFilter(Output output) {
		this.output = output;
	}

	public void send(char c) throws IOException {
		if (c != '\r')
			output.send(c);
	}

	public void close() throws IOException {
		output.close();
	}
}
