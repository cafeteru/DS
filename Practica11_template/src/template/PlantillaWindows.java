package template;

import platform.Image2D;

public class PlantillaWindows extends Plantilla {

	@Override
	public Image2D loadImage(String file) {
		System.out.println(
				"(Windows) Cargada imagen '" + file + "' del disco duro.");
		return new Image2D(file, 10, 10);
	}

	@Override
	public void drawBall(Image2D image) {
		System.out.println("(Windows) Dibujando '" + image.getName() + "' en ["
				+ point.x + "," + point.y + "]");
	}

}
