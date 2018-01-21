package template;

import platform.Image2D;

public class PlantillaAndroid extends Plantilla {

	@Override
	public Image2D loadImage(String file) {
		System.out.println(
				"(Android) Cargada imagen '" + file + "' de la memoria flash.");
		return new Image2D(file, 10, 10);
	}

	@Override
	public void drawBall(Image2D image) {
		System.out.println("(Android) Dibujando '" + image.getName() + "' en ["
				+ point.x + "," + point.y + "]");
	}

}
