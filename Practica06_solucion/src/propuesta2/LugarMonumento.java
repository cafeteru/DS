package propuesta2;

import model.*;
import components.*;
import vista.*;

public class LugarMonumento extends Monumento implements Lugar {

	public LugarMonumento(String name, String author, String address) {
		super(name, author, address);
	}

	public String getNombre() {
		return getNombre();
	}

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

	// En el main sería:
	// ----------------------------------------------
	// Main -----------------------------------
	public static void main(String[] args) {

		LugarMonumento coliseo = new LugarMonumento("Coliseo", "Vespasiano", "Avenida del Coliseo 1. Roma");

		Mapa map = new Mapa();

		map.add(coliseo); // Ahora sí se puede
		map.dibujar();

	}

}
