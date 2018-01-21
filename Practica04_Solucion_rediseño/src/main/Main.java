package main;

import formulario.Campo;
import formulario.Formulario;
import validaciones.CheckNumber;
import validaciones.CheckText;
import validaciones.CheckValues;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new Campo("Nombre", new CheckText()));
		formulario.addCampo(new Campo("Apellido", new CheckText()));
		formulario.addCampo(new Campo("Tel�fono", new CheckNumber()));
		formulario.addCampo(new Campo("Ciudad",
				new CheckValues("Santander", "Oviedo", "C�diz")));

		formulario.PideDatos();
	}

}
