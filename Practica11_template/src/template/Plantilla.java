package template;

import java.awt.Point;

import platform.Image2D;

public abstract class Plantilla {
	Point point = new Point(0, 0);

	public void play() {
		// Inicializar la API adecuada
		Image2D image = loadImage("Bola.jpg");

		// Lógica principal del juego
		for (int i = 0; i < 10; i++) {
			point = getPosition();
			// Comprobar colisiones...
			// Imprimir marcador...
			// Otra lógica del juego...
			drawBall(image);
		}
	}

	public abstract Image2D loadImage(String file);

	public Point getPosition() {
		point.translate(10, 10);
		return new Point(point);
	}

	public abstract void drawBall(Image2D image);

}
