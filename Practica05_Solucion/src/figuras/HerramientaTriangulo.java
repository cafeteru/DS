package figuras;

import java.awt.Point;

import editor.Editor;
import editor.Figura;
import editor.Historial;
import herramientas.CambioCreacion;
import herramientas.Herramienta;

public class HerramientaTriangulo implements Herramienta {
	public HerramientaTriangulo(Editor editor) {
		this.editor = editor;
	}

	public void pinchar(int x, int y) {
		vertice[vertices++] = new Point(x, y);
		if (vertices == 3) {
			Figura figura = new Triangulo(vertice[0], vertice[1], vertice[2]);
			editor.getDibujo().addFigura(figura);
			Historial.getInstance().añadeCambio(
					new CambioCreacion(editor.getDibujo(), figura));
			vertices = 0;
			editor.finHerramienta();
		}
	}

	public void mover(int x, int y) {
	}

	public void soltar(int x, int y) {
	}

	private int vertices = 0;
	private Point[] vertice = new Point[3];
	private Editor editor;
}
