package herramientas;

import editor.*;

public class CambioCreacion implements Cambio {

	private Figura figura;
	private Dibujo dibujo;

	public CambioCreacion(Dibujo dibujo, Figura figura) {
		this.figura = figura;
		this.dibujo =  dibujo;
	}

	public void undo() {
		dibujo.removeFigura(figura);
	}

	public void redo() {
		dibujo.addFigura(figura);
	}

}
