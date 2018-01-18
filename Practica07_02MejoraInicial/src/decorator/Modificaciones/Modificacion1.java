package decorator.Modificaciones;

import java.io.IOException;

import decorator.Encriptar;
import decorator.Normalizar;
import outputs.Output;

public class Modificacion1 extends Normalizar {
	private Output output;

	public Modificacion1(Output output, boolean encriptar) {
		super(output);
		if (true)
			this.output = new Encriptar(output);
	}

	@Override
	public void send(char c) throws IOException {
		output.send(c);
	}

}
