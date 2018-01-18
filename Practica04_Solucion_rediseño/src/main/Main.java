package main;

import formulario.*;
import validaciones.*;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new Campo("Nombre", new CheckText()));
		formulario.addCampo(new Campo("Apellido", new CheckText()));
		formulario.addCampo(new Campo("Teléfono", new CheckNumber()));
		formulario.addCampo(new Campo("Ciudad", new CheckValues("Santander", "Oviedo", "Cádiz")));

		formulario.PideDatos();
	}

}
