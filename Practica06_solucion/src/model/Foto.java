package model;

import components.*;

public class Foto {

	private String description;
	private String user; // Usuario que ha subido la foto
	private Coordenadas coordinates;	// Coordenadas de la foto

	public Foto(String description, String user, Coordenadas coordinates) {
		this.description = description;
		this.user = user;
		this.coordinates = coordinates;
	}

	public String getDescripcion() {
		return description;
	}

	public String getUsuario() {
		return user;
	}

	public Coordenadas getCoordenadas() {
		return coordinates;
	}

	// Baja la foto
	public void descargar() {
		System.out.println("Bajando foto: " + description);
	}

}
