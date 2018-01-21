package main;

import formulario.Campo;
import formulario.Formulario;
import validaciones.CheckCodigoPostal;
import validaciones.CheckGreater;
import validaciones.CheckLength;
import validaciones.CheckLess;
import validaciones.CheckNumber;
import validaciones.CheckText;
import validaciones.CheckValues;
import validaciones.composite.CheckAll;
import validaciones.composite.CheckAny;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new Campo("Nombre", new CheckText()));
		formulario.addCampo(new Campo("Apellido", new CheckText()));
		formulario.addCampo(new Campo("Tel�fono", new CheckNumber()));
		formulario.addCampo(new Campo("Ciudad",
				new CheckValues("Santander", "Oviedo", "Cadiz")));

		// "C�digo de Producto". Longitud = 4
		formulario
				.addCampo(new Campo("C�digo de Producto", new CheckLength(4)));

		// "C�digo Postal". Digitos y longitud = 5
		formulario.addCampo(new Campo("C�digo Postal",
				new CheckAll(new CheckNumber(), new CheckLength(5))));
		formulario
				.addCampo(new Campo("C�digo Postal", new CheckCodigoPostal()));

		// "Edad". Digitos y mayor 18
		formulario.addCampo(new Campo("Edad",
				new CheckAll(new CheckNumber(), new CheckGreater(18))));
		// "Sueldo". Digitos y mayor que 800 y menor que 1200
		formulario.addCampo(new Campo("Sueldo", new CheckAll(new CheckNumber(),
				new CheckGreater(800), new CheckLess(1200))));

		// "Ubicaci�n". Santander..C�diz o c�digo postal
		formulario.addCampo(new Campo("Ubicaci�n",
				new CheckAny(new CheckValues("Santander", "Oviedo", "C�diz"),
						new CheckCodigoPostal())));

		// "C�digo de Promoci�n". Texto o (numero de 3 digitos)
		formulario.addCampo(new Campo("Promoci�n", new CheckAny(new CheckText(),
				new CheckAll(new CheckNumber(), new CheckLength(3)))));

		formulario.PideDatos();
	}

}
