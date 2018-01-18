package outputs.filters;

import java.io.*;

import outputs.*;

public class Counter implements Output {

	private Output output;
	private int counter;

	public Counter(Output output) {
		this.output = output;
	}

	public void send(char c) throws IOException {
		output.send(c);
		counter++;
	}

	public int getCounter() {
		return counter;
	}

	public void close() throws IOException {
		output.close();
	}

}
