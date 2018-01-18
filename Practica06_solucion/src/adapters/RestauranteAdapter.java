package adapters;

import model.*;
import components.*;
import vista.Lugar;

public class RestauranteAdapter implements Lugar {

	private Restaurante restaurant;
	private GPS gps = new GPS();

	public RestauranteAdapter(Restaurante restaurant) {
		this.restaurant = restaurant;
	}

	public String getNombre() {
		return "Restaurant: " + restaurant.getNombre();
	}

	public Coordenadas getCoordinates() {
		return gps.getCoordenadas(restaurant.getDireccion());
	}

	public String getTooltipText() {
		return "Restaurant '" + restaurant.getNombre() + "'. Tfn: " + restaurant.getTelefono();
	}

	public void open() {
		restaurant.llamar();
	}

}
