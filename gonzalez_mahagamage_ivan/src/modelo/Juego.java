package modelo;

import modelo.Armas.Arma;

public class Juego {
	private Personaje personaje;

	public Juego(Arma arma) {
		personaje = new Personaje(arma);
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void actualizar() {
		personaje.avanzar();
	}

	public void dibujar() {
		personaje.dibujar();
	}
}
