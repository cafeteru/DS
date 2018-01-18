package editor.command;

import editor.Figura;

public class CambioMoverFigura implements Cambio {
	Figura actual;
	int posicionXAnterior, posicionYAnterior;

	public CambioMoverFigura(Figura actual, int posicionX, int posicionY) {
		this.actual = actual;
		this.posicionXAnterior = posicionX;
		this.posicionYAnterior = posicionY;
	}

	@Override
	public void rehacer() {
		actual.mover(posicionXAnterior, posicionXAnterior);
	}

	@Override
	public void deshacer() {
		if (actual != null){
			actual.mover(-posicionXAnterior, -posicionXAnterior);
		}
	}

}
