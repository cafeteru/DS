package editor;

import java.util.Stack;

public class Historial {
	private static final Historial instance = new Historial();

	private Historial() {
	}

	public static Historial getInstance() {
		return instance;
	}

	public void añadeCambio(Cambio change) {
		undos.push(change);
		redos.clear();
	}

	public void undo() {
		if (undos.isEmpty()) {
			System.out.println("Traza: no es posible hacer undo");
			return;
		}
		Cambio change = undos.pop();
		change.undo();
		redos.push(change);
	}

	public void redo() {
		if (redos.isEmpty()) {
			System.out.println("Traza: no es posible hacer redo");
			return;
		}
		Cambio cambio = redos.pop();
		cambio.redo();
		undos.push(cambio);
	}

	private Stack<Cambio> undos = new Stack<Cambio>();
	private Stack<Cambio> redos = new Stack<Cambio>();
}
