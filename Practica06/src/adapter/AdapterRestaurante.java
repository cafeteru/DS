package adapter;

import components.Coordinates;
import components.GPS;
import model.Restaurant;
import views.MapElement;

public class AdapterRestaurante implements MapElement {

	Restaurant restaurant;
	GPS gps;

	public AdapterRestaurante(Restaurant restaurant) {
		this.restaurant = restaurant;
		gps = new GPS();
	}

	@Override
	public String getName() {
		return restaurant.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return gps.getCoordinates(restaurant.getAddress());
	}

	@Override
	public String getTooltipInfo() {
		return restaurant.getName() + " - " + restaurant.getPhone();
	}

	@Override
	public void open() {
		restaurant.call();
	}

}
