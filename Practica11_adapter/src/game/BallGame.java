package game;

import java.awt.Point;

import Adapter.Adapter;
import Adapter.AdapterAndroid;
import Adapter.AdapterPlaystation;
import Adapter.AdapterWindows;
import platform.*;

/* Esta clase/paquete sería el código del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas 
 */

enum Platform {
	ANDROID, WINDOWS, PLAYSTATION
};

public class BallGame {

	// Seleccionar para qué plataforma se quiere generar el juego
	private Platform platform;

	private Adapter adapter;

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
			adapter = new AdapterAndroid();
		else if (platform == Platform.WINDOWS)
			adapter = new AdapterWindows();
		else
			adapter = new AdapterPlaystation();
	}

	private Image2D loadImage(String file) {
		return adapter.loadImage(file);
	}

	private Point getPosition() {
		return adapter.getPosition();
	}

	private void drawBall(Image2D image, Point point) {
		adapter.drawBall(image, point);
	}

}
