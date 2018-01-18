package modelo;

import java.util.*;

import modelo.tiposProyectil.Proyectil;

public class Proyectiles {
	private List<Proyectil> proyectiles = new ArrayList<Proyectil>();

	public void proyectil(Proyectil proyectil) {
		proyectiles.add(proyectil);
	}

	public void dibujar() {
		for (Proyectil proyectil : proyectiles) {
			proyectil.dibujar();
		}
	}

	public void mover() {
		for (Proyectil proyectil : proyectiles) {
			proyectil.mover();
		}
	}

	public void borrar() {
		proyectiles.clear();
	}

}
