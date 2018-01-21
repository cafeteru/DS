package editor.figuras;

import java.awt.Point;

public class Cuadrado implements Figura {
	int x, y; // Coordenadas del lugar donde se ha pinchado el rat�n
	Point esquina;
	int ancho, alto; // Atributos del tri�ngulo

	boolean pinchado;

	public Cuadrado(Point inicio, Point fin) {
		esquina = inicio;
		ancho = fin.x - esquina.x;
		alto = fin.y - esquina.y;
		pinchado = false;
	}

	@Override
	public void dibujar() {
		System.out.println("Cuadrado: x = " + esquina.getX() + " , y = " + ""
				+ esquina.getY() + ", ancho = " + ancho + "" + ", alto = "
				+ alto);
	}

	public boolean seleccionado() {
		pinchado = (esquina.x <= x && x <= esquina.x + ancho)
				&& (esquina.y <= y && y <= esquina.y + alto);
		return pinchado;
	}

}
