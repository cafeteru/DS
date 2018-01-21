package editor.figuras;

import java.awt.Point;

public class Triangulo implements Figura {
	int x, y; // Coordenadas del lugar donde se ha pinchado el rat�n
	Point v1, v2, v3; // Los tres v�rtices del tri�ngulo

	Point posicion = new Point(x, y);
	boolean pinchado = posicion.equals(v1) || posicion.equals(v2)
			|| posicion.equals(v3);

	public Triangulo(Point v1, Point v2, Point v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	@Override
	public void dibujar() {
		System.out.println(
				"Triangulo: v1 = (" + v1.x + ", " + v1.y + "), v2 = (" + v2.x
						+ ", " + v2.y + "), v3 = (" + v3.x + ", " + v3.y + ")");
	}

}
