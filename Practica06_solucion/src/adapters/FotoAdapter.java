package adapters;

import model.*;
import components.*;
import vista.Lugar;

public class FotoAdapter implements Lugar {

	private Foto photo;

	public FotoAdapter(Foto photo) {
		this.photo = photo;
	}

	public String getNombre() {
		return "Photo: " + photo.getDescripcion();
	}

	public String getTooltipText() {
		return photo.getDescripcion() + ". Foto subida por " + photo.getUsuario();
	}

	public void open() {
		photo.descargar();
	}

	public Coordenadas getCoordinates() {
		return photo.getCoordenadas();
	}

}
