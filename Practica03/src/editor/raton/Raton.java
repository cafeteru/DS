package editor.raton;

import java.awt.Point;

import editor.Dibujo;

public class Raton {
	boolean estaPulsado;
	Dibujo dibujo;

	public Raton(Dibujo dibujo) {
		estaPulsado = false;
		this.dibujo = dibujo;
	}

	public Point pinchar(int x, int y) {
		Point punto = new Point(x, y);
		estaPulsado = true;
		return punto;
	}

	public Point soltar(int x, int y) {
		if (estaPulsado) {
			estaPulsado = false;
			return new Point(x, y);
		}
		return inicializar();
	}

	private Point inicializar() {
		estaPulsado = false;
		return null;
	}

	public void mover(Point punto) {

	}

}
