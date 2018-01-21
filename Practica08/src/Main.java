import java.io.IOException;

import encuesta.Encuesta;
import encuesta.UserInterface;
import encuesta.Observer.ObserverContador;
import encuesta.Observer.Decorator.GraficoBarras4;
import encuesta.Observer.Decorator.GraficoCircular3;

public class Main {

	public static void main(String[] args) throws IOException {
		Encuesta encuesta = new Encuesta(
				"�Est� a favor de la energia nuclear?");
		encuesta.añadir(new ObserverContador(encuesta));
		encuesta.añadir(new GraficoCircular3(encuesta));
		encuesta.añadir(new GraficoBarras4(encuesta));

		UserInterface userInterface = new UserInterface();
		userInterface.rellena(encuesta);
	}

}
