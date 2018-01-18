package propuesta1;

import vista.*;
import components.*;

public class Monumento implements Lugar {

	// ----------------------------------------------
	// Código anterior igual ------------
	private String name;
	private String author;
	private String address;

	public Monumento(String name, String author, String address) {
		this.name = name;
		this.author = author;
		this.address = address;
	}

	public String getNombre() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAuthor() {
		return author;
	}

	// ----------------------------------------------
	// Añadir estos métodos de MapElement ------------

	public Coordenadas getCoordinates() {
		/* Hacerlo */
		return null;
	}

	public String getTooltipText() {
		/* Hacerlo */
		return null;
	}

	public void open() {
		/* Hacerlo */
	}

}
