package modelo;

import modelo.Armas.Arma;
import modelo.Armas.Arsenal;

public class Personaje {
	private Arsenal arsenal;
	private Arma armaActual;
	private int posicion;

	public Personaje(Arma arma) {
		arsenal = new Arsenal(arma);
		armaActual = arma;
	}

	public void avanzar() {
		posicion++;
		arsenal.avanzar();
	}

	public void dibujar() {
		System.out.println("Personaje en la posición " + posicion
				+ " con el arma " + armaActual);
		arsenal.dibujar();
	}

	public void setArma(Arma arma) {
		this.armaActual = arsenal.setArma(arma);
	}

	public void disparar() {
		armaActual.disparar();
	}

	public void recargar() {
		armaActual.recargar();
	}

	public void borrar() {
		arsenal.borrar();
	}
}
