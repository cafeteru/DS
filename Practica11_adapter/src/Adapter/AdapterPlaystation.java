package Adapter;

import java.awt.Point;

import platform.Image2D;
import platform.playstation.Playstation5API;

public class AdapterPlaystation implements Adapter {
	Playstation5API playstation5api;

	public AdapterPlaystation() {
		playstation5api = new Playstation5API();
	}

	@Override
	public Image2D loadImage(String file) {
		return playstation5api.loadGraphics(file);
	}

	@Override
	public Point getPosition() {
		return playstation5api.getJoystick();
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		playstation5api.render(point.x, point.y, image);

	}
}
