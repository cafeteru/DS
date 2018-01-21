package vista;

import components.Coordenadas;

public interface Lugar {
	String getNombre();

	Coordenadas getCoordinates();

	String getTooltipText();

	void open();
}
