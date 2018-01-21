package propuesta2;

import components.Coordenadas;
import model.Monumento;
import vista.Lugar;
import vista.Mapa;

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

	// En el main ser�a:
	// ----------------------------------------------
	// Main -----------------------------------
	public static void main(String[] args) {

		LugarMonumento coliseo = new LugarMonumento("Coliseo", "Vespasiano",
				"Avenida del Coliseo 1. Roma");

		Mapa map = new Mapa();

		map.add(coliseo); // Ahora s� se puede
		map.dibujar();

	}

}
