package template;

import platform.Image2D;

public class PlantillaPlayStation extends Plantilla {

	@Override
	public Image2D loadImage(String file) {
		System.out.println("(PS5) Cargada imagen '" + file + "' del DVD.");
		return new Image2D(file, 10, 10);
	}

	@Override
	public void drawBall(Image2D image) {
		System.out.println("(PS5) Dibujando '" + image.getName() + "' en ["
				+ point.x + "," + point.y + "]");

	}

}
