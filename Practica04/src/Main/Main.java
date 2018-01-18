package Main;

import Campos.*;
import Campos.Strategy.*;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new Campo("Nombre", new ComprobarTexto()));
		formulario.addCampo(new Campo("Apellido", new ComprobarTexto()));
		formulario.addCampo(new Campo("Teléfono", new ComprobarNumero()));
		formulario.addCampo(new Campo("Ciudad", new ComprobarPredefinido("Santander", "Oviedo", "Cádiz")));
		formulario.addCampo(new Campo("Código producto", new ComprobarProducto()));
		formulario.addCampo(new Campo("Código Postal", new ComprobarPostal()));
		formulario.addCampo(new Campo("Edad", new ComprobarEdad()));
		formulario.addCampo(new Campo("Sueldo", new ComprobarSueldo()));
		formulario.addCampo(new Campo("Ubicación", new ComprobarUbicacion("Santander", "Oviedo", "Cádiz")));
		formulario.PideDatos();
	}
}
