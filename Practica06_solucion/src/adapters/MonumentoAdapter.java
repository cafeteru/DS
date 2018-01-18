package adapters;

import model.*;
import components.*;
import vista.Lugar;

public class MonumentoAdapter implements Lugar {

	private Monumento monument;
	private GPS gps = new GPS();

	public MonumentoAdapter(Monumento monument) {
		this.monument = monument;
	}

	public String getNombre() {
		return "Monument: " + monument.getNombre();
	}

	public Coordenadas getCoordinates() {
		return gps.getCoordenadas(monument.getDireccion());
	}

	public String getTooltipText() {
		return monument.getNombre() + ". Construido por " + monument.getAutor();
	}

	public void open() {
		gps.navigate(monument.getDireccion());
	}

}
