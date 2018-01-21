package adapter;

import components.Coordinates;
import components.GPS;
import model.Monument;
import views.MapElement;

public class AdapterMonument implements MapElement {

	Monument monument;
	GPS gps;

	public AdapterMonument(Monument monument) {
		this.monument = monument;
		gps = new GPS();
	}

	@Override
	public String getName() {
		return monument.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return gps.getCoordinates(monument.getAddress());
	}

	@Override
	public String getTooltipInfo() {
		return monument.getName() + " - " + monument.getAuthor();
	}

	@Override
	public void open() {
		gps.navigate(monument.getAddress());
	}

}
