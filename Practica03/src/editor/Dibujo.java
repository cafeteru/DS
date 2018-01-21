package editor;

import java.util.ArrayList;
import java.util.List;

import editor.figuras.Figura;

public class Dibujo {
	private List<Figura> figuras;

	public Dibujo() {
		figuras = new ArrayList<>();
	}

	public void dibujar() {
		for (Figura figura : figuras)
			figura.dibujar();
	}

	public void añadirFigura(Figura figura) {
		figuras.add(figura);
	}

	public List<Figura> getFiguras() {
		return figuras;
	}

}
