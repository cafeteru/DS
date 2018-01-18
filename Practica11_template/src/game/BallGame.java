package game;

import java.awt.Point;
import platform.*;
import template.*;

/* Esta clase/paquete sería el código del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas 
 */

enum Platform {
	ANDROID, WINDOWS, PLAYSTATION
};

public class BallGame {

	// Seleccionar para qué plataforma se quiere generar el juego
	private Platform platform;

	private Plantilla plantilla;

	public BallGame(Platform platform) {
		this.platform = platform;
	}

	public void play() {

		// Inicializar la API adecuada
		setAPI();

		Image2D image = loadImage("Bola.jpg");

		// Lógica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = getPosition();
			// Comprobar colisiones...
			// Imprimir marcador...
			// Otra lógica del juego...
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
