package views;

import components.Coordinates;

public interface MapElement {
	String getName();

	Coordinates getCoordinates();

	String getTooltipInfo();

	void open();
}
