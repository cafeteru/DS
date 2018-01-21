package figuras;

import java.awt.Point;

import editor.Figura;

public class Circulo implements Figura {

	public Circulo(Point centro, int radio) {
		this.centro = centro;
		this.radio = radio;
	}

	public void dibujar() {
		System.out
				.println("C�rculo: centro = " + centro + ", radio = " + radio);
	}

	public void mover(int dx, int dy) {
		centro.translate(dx, dy);
	}

	public boolean contiene(int x, int y) {
		double distancia = Math
				.sqrt(Math.pow(x - centro.x, 2) + Math.pow(y - centro.y, 2));
		return distancia < radio;
	}

	private Point centro;
	private int radio;
}
