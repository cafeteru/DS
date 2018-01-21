package decorator.Modificaciones;

import java.io.IOException;

import decorator.Encriptar;
import decorator.Normalizar;
import decorator.SinEspacios;
import outputs.Output;

public class Modificacion2 extends Encriptar {

	private Output output;

	public Modificacion2(Output output, int opcion) {
		super(output);
		this.output = output;
		elegirOpcion(opcion);
	}

	@Override
	public void send(char c) throws IOException {
		output.send(c);
	}

	private Output elegirOpcion(int i) {
		if (i == 0) {
			return output;
		} else if (i == 1) {
			output = new Normalizar(output);
		} else if (i == 2) {
			output = new Normalizar(output);
			output = new SinEspacios(output);
		} else {
			System.err.println(
					"\nOpci�n no valida -> Se cambia a opci�n por defecto");
		}
		return output;
	}

}
