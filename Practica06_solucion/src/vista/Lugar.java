package vista;

import components.*;

public interface Lugar {
	String getNombre();

	Coordenadas getCoordinates();

	String getTooltipText();

	void open();
}
