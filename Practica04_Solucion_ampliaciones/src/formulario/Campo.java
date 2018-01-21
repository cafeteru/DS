package formulario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Campo {

	public Campo(String etiqueta, Validation validacion) {
		this.etiqueta = etiqueta;
		this.validacion = validacion;
	}

	public void pideDato() {
		BufferedReader consola = new BufferedReader(
				new InputStreamReader(System.in));

		do {
			try {
				System.out.print(etiqueta + ": ");
				texto = consola.readLine();
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!validacion.isValid(texto));
	}

	public String getString() {
		return texto;
	}

	private String texto;
	private String etiqueta;
	private Validation validacion;
}
