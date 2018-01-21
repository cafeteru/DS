package Main;

import java.util.ArrayList;
import java.util.List;

import Campos.Campo;

public class Formulario {
	public void addCampo(Campo campo) {
		campos.add(campo);
	}

	public void PideDatos() {
		for (Campo campo : campos) {
			campo.pideDato();
			System.out.println(campo.getString());
		}
	}

	private List<Campo> campos = new ArrayList<Campo>();
}
