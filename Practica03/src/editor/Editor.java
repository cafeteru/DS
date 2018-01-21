package editor;

import editor.figuras.Figura;
import editor.raton.Raton;

public class Editor {
	private Dibujo dibujo;
	private Raton raton;

	public Editor(Dibujo dibujo, Raton raton) {
		setDibujo(dibujo);
		setRaton(raton);
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	public void setDibujo(Dibujo dibujo) {
		this.dibujo = dibujo;
	}

	public Dibujo getDibujo() {
		return dibujo;
	}

	public void dibujar() {
		dibujo.dibujar();
	}

	public void añadirFigura(Figura figura) {
		dibujo.añadirFigura(figura);
	}
}
