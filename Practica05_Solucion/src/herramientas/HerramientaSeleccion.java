package herramientas;

import java.awt.Point;

import editor.Editor;
import editor.Figura;
import editor.Historial;

public class HerramientaSeleccion implements Herramienta {

	public HerramientaSeleccion(Editor editor) {
		this.editor = editor;
	}

	public void pinchar(int x, int y) {
		seleccionada = editor.getDibujo().getFigura(x, y);
		inicio = lastPosition = new Point(x, y);
	}

	public void mover(int x, int y) {
		mueveIncremento(x, y);
	}

	public void soltar(int x, int y) {
		mueveIncremento(x, y);
		Historial.getInstance().añadeCambio(new CambioMovimiento(seleccionada,
				lastPosition.x - inicio.x, lastPosition.y - inicio.y));
	}

	private void mueveIncremento(int x, int y) {
		if (seleccionada != null) {
			seleccionada.mover(x - lastPosition.x, y - lastPosition.y);
			lastPosition = new Point(x, y);
		}
	}

	private Point inicio, lastPosition;

	private Editor editor;
	private Figura seleccionada;
}
