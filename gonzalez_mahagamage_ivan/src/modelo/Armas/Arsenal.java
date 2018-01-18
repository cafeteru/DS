package modelo.Armas;

import java.util.ArrayList;
import java.util.List;

/**
 * Como el jugador dispone de varias armas, para poder actualizarlas la
 * informacion de ellas a la vez he utilizado el patrón Composite, a la vez.
 * 
 * Este es el Compuesto en el patrón Compuesto.
 * 
 * @author uo239795
 *
 */
public class Arsenal {
	private List<Arma> arsenal;

	public Arsenal(Arma arma) {
		arsenal = new ArrayList<Arma>();
		arsenal.add(arma);
	}

	public void avanzar() {
		for (Arma arma : arsenal) {
			arma.mover();
		}
	}

	public void dibujar() {
		System.out.println("-- Proyectiles en vuelo:");
		for (Arma arma : arsenal) {
			arma.dibujar();
		}
	}

	public Arma setArma(Arma arma) {
		for (Arma a : arsenal) {
			if (a.toString().equals(arma.toString()))
				return a;
		}
		arsenal.add(arma);
		return arma;
	}

	public void borrar() {
		for (Arma arma : arsenal) {
			arma.borrar();
		}
	}
}
