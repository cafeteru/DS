package platform.android;

import java.awt.Point;

import game.AbstractBallGame;
import platform.Image2D;

public class AndroidBallGame extends AbstractBallGame {

	private AndroidAPI android;

	public AndroidBallGame() {
		android = new AndroidAPI();
	}

	@Override
	protected Image2D loadImage(String file) {
		return android.loadResource(file);
	}

	@Override
	protected Point getPosition() {
		return android.getTouch();
	}

	@Override
	protected void drawBall(Image2D image, Point point) {
		android.draw(point.x, point.y, image);
	}

}
