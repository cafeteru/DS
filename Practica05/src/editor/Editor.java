package editor;

import editor.command.CambioCrearFigura;
import editor.command.CambioMoverFigura;
import editor.command.Historial;
import herramientas.Herramienta;
import herramientas.HerramientaSeleccion;

public class Editor {
	private Dibujo dibujo;
	private Herramienta actual;
	private Herramienta principal;
	private Historial historial;
	private int posicionX, posicionY;

	public Editor(Dibujo dibujo) {
		setDibujo(dibujo);
		actual = principal = createDefaultTool();
		historial = new Historial();
	}

	public void setDibujo(Dibujo dibujo) {
		this.dibujo = dibujo;
	}

	public Dibujo getDibujo() {
		return dibujo;
	}

	public void dibujar() {
		System.out.println("Herramienta: " + actual);
		dibujo.dibuja();
	}

	// Herramientas -------------------
	protected Herramienta createDefaultTool() {
		return new HerramientaSeleccion(this);
	}

	public Herramienta getDefaultTool() {
		return principal;
	}

	public void setHerramienta(Herramienta herramienta) {
		if (herramienta != null)
			this.actual = herramienta;
	}

	public void pinchar(int x, int y) {
		actual.pinchar(x, y);
		this.posicionX = x;
		this.posicionY = y;
	}

	public void mover(int x, int y) {
		Figura ultima = dibujo.figuras.get(dibujo.figuras.size() - 1);
		actual.mover(x, y);
		historial.añadirCambio(
				new CambioMoverFigura(ultima, x - posicionX, y - posicionY));
	}

	public void soltar(int x, int y) {
		Figura penultima = null;
		if (dibujo.figuras.size() > 1)
			penultima = dibujo.figuras.get(dibujo.figuras.size() - 1);
		actual.soltar(x, y);
		Figura ultima = dibujo.figuras.get(dibujo.figuras.size() - 1);
		historial.añadirCambio(new CambioCrearFigura(penultima, ultima, this));
	}

	public void finHerramienta() {
		actual = principal;
	}

	public void deshacer() {
		historial.deshacer();
	}

	public void rehacer() {
		historial.rehacer();
	}

}
