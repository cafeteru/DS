package Adapter;

import java.awt.Point;

import platform.Image2D;
import platform.android.AndroidAPI;

public class AdapterAndroid implements Adapter {
	AndroidAPI androidAPI;

	public AdapterAndroid() {
		androidAPI = new AndroidAPI();
	}

	@Override
	public Image2D loadImage(String file) {
		return androidAPI.loadResource(file);
	}

	@Override
	public Point getPosition() {
		return androidAPI.getTouch();

	}

	@Override
	public void drawBall(Image2D image, Point point) {
		androidAPI.draw(point.x, point.y, image);
	}
}
