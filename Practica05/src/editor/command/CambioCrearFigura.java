package editor.command;

import editor.Editor;
import editor.Figura;

public class CambioCrearFigura implements Cambio {
	Figura anterior, actual;
	Editor editor;

	public CambioCrearFigura(Figura anterior, Figura actual, Editor editor) {
		this.anterior = anterior;
		this.actual = actual;
		this.editor = editor;
	}

	@Override
	public void rehacer() {
		editor.getDibujo().AddFigura(actual);
	}

	@Override
	public void deshacer() {
		if (actual != null)
			editor.getDibujo().remove(actual);
		if (anterior != null)
			editor.getDibujo().AddFigura(anterior);
	}

}
