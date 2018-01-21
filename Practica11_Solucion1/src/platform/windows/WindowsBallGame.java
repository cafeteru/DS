package platform.windows;

import java.awt.Point;

import game.AbstractBallGame;
import platform.Image2D;

public class WindowsBallGame extends AbstractBallGame {
	private WindowsAPI windows;

	protected WindowsBallGame() {
		windows = new WindowsAPI();
	}

	@Override
	protected Image2D loadImage(String file) {
		return windows.loadFile(file);
	}

	@Override
	protected Point getPosition() {
		return windows.getMouseClick();
	}

	@Override
	protected void drawBall(Image2D image, Point point) {
		windows.paint(point.x, point.y, image);
	}

}
