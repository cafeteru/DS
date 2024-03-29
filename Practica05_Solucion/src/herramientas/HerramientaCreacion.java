package herramientas;

import java.awt.Point;

import editor.Editor;
import editor.Figura;
import editor.Historial;

public abstract class HerramientaCreacion implements Herramienta {

	public HerramientaCreacion(Editor editor) {
		this.editor = editor;
	}

	public void pinchar(int x, int y) {
		inicio = new Point(x, y);
	}

	public void mover(int x, int y) {
	}

	public void soltar(int x, int y) {
		fin = new Point(x, y);
		Figura figura = doCreaFigura(inicio, fin);
		editor.getDibujo().addFigura(figura);
		Historial.getInstance()
				.añadeCambio(new CambioCreacion(editor.getDibujo(), figura));
		editor.finHerramienta();
	}

	protected abstract Figura doCreaFigura(Point inicio, Point fin);

	protected Editor editor;
	private Point inicio, fin;
}