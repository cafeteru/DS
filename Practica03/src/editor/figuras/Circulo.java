package editor.figuras;

import java.awt.Point;

public class Circulo implements Figura {
	int x, y; // Coordenadas del lugar donde se ha pinchado el ratón
	Point centro;
	int radio; // Atributos del círculo

	double distancia;
	boolean pinchado;

	public Circulo(Point inicio, Point fin) {
		centro = new Point(fin.x - inicio.x, fin.y - inicio.y);
		radio = centro.x - inicio.x;
		distancia = Math.sqrt(Math.pow(x - centro.x, 2) + Math.pow(y - centro.y, 2));
	}

	@Override
	public void dibujar() {
		System.out.println("Círculo: centro = (" + centro.x + ", " + centro.y + "), radio = " + radio);
	}

	public boolean seleccionado(){
		return distancia < radio;
	}
}
