package Adapter;

import java.awt.Point;

import platform.Image2D;
import platform.windows.WindowsAPI;

public class AdapterWindows implements Adapter {
	WindowsAPI api;

	public AdapterWindows() {
		api = new WindowsAPI();
	}

	@Override
	public Image2D loadImage(String file) {
		return api.loadFile(file);
	}

	@Override
	public Point getPosition() {
		return api.getMouseClick();
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		api.paint(point.x, point.y, image);
	}
}
