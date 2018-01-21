package propuesta1;

import components.Coordenadas;
import vista.Lugar;

public class Monumento implements Lugar {

	// ----------------------------------------------
	// C�digo anterior igual ------------
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
	// A�adir estos m�todos de MapElement ------------

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
