package game;

import java.awt.Point;

import platform.Image2D;
import template.Plantilla;
import template.PlantillaAndroid;
import template.PlantillaPlayStation;
import template.PlantillaWindows;

/* Esta clase/paquete ser�a el c�digo del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas 
 */

enum Platform {
	ANDROID, WINDOWS, PLAYSTATION
};

public class BallGame {

	// Seleccionar para qu� plataforma se quiere generar el juego
	private Platform platform;

	private Plantilla plantilla;

	public BallGame(Platform platform) {
		this.platform = platform;
	}

	public void play() {

		// Inicializar la API adecuada
		setAPI();

		Image2D image = loadImage("Bola.jpg");

		// L�gica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = getPosition();
			// Comprobar colisiones...
			// Imprimir marcador...
			// Otra l�gica del juego...
			drawBall(image, point);
		}
	}

	private void setAPI() {
		if (platform == Platform.ANDROID)
			plantilla = new PlantillaAndroid();
		else if (platform == Platform.WINDOWS)
			plantilla = new PlantillaWindows();
		else
			plantilla = new PlantillaPlayStation();
	}

	private Image2D loadImage(String file) {
		Image2D image = plantilla.loadImage(file);
		return image;
	}

	private Point getPosition() {
		return plantilla.getPosition();
	}

	private void drawBall(Image2D image, Point point) {
		plantilla.drawBall(image);
	}

}
