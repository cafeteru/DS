package figuras;

import java.awt.Point;

import editor.Editor;
import editor.Figura;
import herramientas.HerramientaCreacion;

public class HerramientaCuadrado extends HerramientaCreacion {

	public HerramientaCuadrado(Editor editor) {
		super(editor);
	}

	protected Figura doCreaFigura(Point inicio, Point fin) {
		return new Cuadrado(inicio, fin);
	}
}
