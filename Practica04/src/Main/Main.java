package Main;

import Campos.Campo;
import Campos.Strategy.ComprobarEdad;
import Campos.Strategy.ComprobarNumero;
import Campos.Strategy.ComprobarPostal;
import Campos.Strategy.ComprobarPredefinido;
import Campos.Strategy.ComprobarProducto;
import Campos.Strategy.ComprobarSueldo;
import Campos.Strategy.ComprobarTexto;
import Campos.Strategy.ComprobarUbicacion;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new Campo("Nombre", new ComprobarTexto()));
		formulario.addCampo(new Campo("Apellido", new ComprobarTexto()));
		formulario.addCampo(new Campo("Tel�fono", new ComprobarNumero()));
		formulario.addCampo(new Campo("Ciudad",
				new ComprobarPredefinido("Santander", "Oviedo", "C�diz")));
		formulario.addCampo(
				new Campo("C�digo producto", new ComprobarProducto()));
		formulario.addCampo(new Campo("C�digo Postal", new ComprobarPostal()));
		formulario.addCampo(new Campo("Edad", new ComprobarEdad()));
		formulario.addCampo(new Campo("Sueldo", new ComprobarSueldo()));
		formulario.addCampo(new Campo("Ubicaci�n",
				new ComprobarUbicacion("Santander", "Oviedo", "C�diz")));
		formulario.PideDatos();
	}
}
