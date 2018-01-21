package platform.windows;

import java.awt.Point;

import platform.Image2D;
import platform.PlatformAdapter;

public class WindowsAdapter implements PlatformAdapter {

	@Override
	public Image2D load(String name) {
		return windows.loadFile(name);
	}

	@Override
	public void show(int x, int y, Image2D image) {
		windows.paint(x, y, image);
	}

	@Override
	public Point getPosition() {
		return windows.getMouseClick();
	}

	private WindowsAPI windows = new WindowsAPI();
}
