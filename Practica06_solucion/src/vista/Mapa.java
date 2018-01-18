package vista;

import java.awt.Rectangle;
import java.util.*;

import components.*;

public class Mapa {
	private List<Lugar> lugares = new ArrayList<Lugar>();

	public void add(Lugar element) {
		lugares.add(element);
	}

	public void dibujar() {
		for (Lugar lugar : lugares)
			System.out.println(lugar.getNombre() + " " + lugar.getCoordinates());
	}

	public void click(int x, int y) {
		Lugar lugar = buscaLugar(x, y);
		if (lugar != null)
			System.out.println("Ventana flotante: " + lugar.getTooltipText());
	}

	public void longClick(int x, int y) {
		Lugar lugar = buscaLugar(x, y);
		if (lugar != null)
			lugar.open();
	}

	private Lugar buscaLugar(int x, int y) {
		for (Lugar lugar : lugares) {
			Coordenadas coordinates = lugar.getCoordinates();
			Rectangle elementArea = new Rectangle((int) coordinates.getLongitud(), (int) coordinates.getLatitud(), 9, 9);
			if (elementArea.contains(x, y))
				return lugar;
		}
		return null;
	}

}
